package com.example;

public class Pista {
    public int  pista = 4;

    public Pista(){

    }
    public synchronized void entra(){

    String name = Thread.currentThread().getName();
        while (pista == 0) {
            try {
                System.out.println(name + " sta aspettando di entrare in pista");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pista--;
            System.out.println(name + " è entrato nella pista");
    }

    public synchronized void esci(){
        
    String name = Thread.currentThread().getName();
    System.out.println(name + " è uscito dalla pista");
        pista++;
        notifyAll();
    }
}
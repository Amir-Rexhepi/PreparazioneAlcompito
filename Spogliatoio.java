package com.example;

public class Spogliatoio {
    public int stanza = 2;


public Spogliatoio(){

    }
    
    public synchronized void entra(){   
        String name = Thread.currentThread().getName();
      while (stanza == 0) {
        try {
            System.out.println(name + " sta aspettando di entrare nello spogliatoio");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      }
      stanza--;
      System.out.println(name + " é entrato nello spogliatoio");
    }
    
    public synchronized void esci(){
        String name = Thread.currentThread().getName();
        stanza ++;
        System.out.println(name + " è uscito dallo spogliatoio");
        notifyAll();
    }
}
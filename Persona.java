package com.example;

public class Persona extends Thread{
       
    private Pista p;
    private Spogliatoio s;
    
    public Persona(Pista p, Spogliatoio s, String name){
        super(name);
        this.p = p;
        this.s = s;
    }
    public void setP(Pista p) {
        this.p = p;
    }
    public void setS(Spogliatoio s) {
        this.s = s;
    }
    public Pista getP() {
        return p;
    }
    public Spogliatoio getS() {
        return s;
    }

    public void run(){
  try {
        int giri = 0;

        String  nome  = Thread.currentThread().getName();
        s.entra();
        
            Thread.sleep((int) Math.random()*1000);
        s.esci();
        Thread.sleep((int) Math.random()*1000);
        p.entra();
        while (giri <= 5) {
            int tempo = (int) (Math.random() * 1000) +1000; 
            System.out.println(nome + " ha effetuato il: " + giri + "° giro "+ " in: " + tempo + " millisecondi");
            giri++;
        }
        p.esci();
        s.entra();
            Thread.sleep((int) Math.random()*1000);
         s.esci();
        } 
        
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

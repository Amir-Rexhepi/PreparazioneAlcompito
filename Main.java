package com.example;

public class Main {
    public static void main(String[] args) {
        Pista p = new Pista();
        Spogliatoio s = new Spogliatoio();
      String[] nome = {"Marco", "Alex", "Mattia", "Lapo", "Tommaso", "Leonardo", "Francesco", "Gianluca"};
        for(int i = 0; i < 8 ; i++)
        {
            Persona p1 = new Persona(p, s, nome[i]);
            p1.start();
        }
    }
}
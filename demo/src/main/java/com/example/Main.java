package com.example;

public class Main {
    public static void main(String[] args) {
        Spogliatoio s= new Spogliatoio();
        Pista p= new Pista();

        for(int i=0; i<8;i++){
            Persone per = new Persone(s, p, "Amico "+ (i+1));
            per.start();
        }


    }
}
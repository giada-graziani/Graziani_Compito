package com.example;

public class Spogliatoio {
    int spazioSpogliatoio=0;

    public synchronized int entraSpogliatoio(){
        String nome= Thread.currentThread().getName();
        int tempo=0;
        try{

            while(spazioSpogliatoio>=2){
                wait();
            }

            //entra
            tempo=((int)(Math.random())*3000)+1000;
            spazioSpogliatoio++;
            System.out.println("il pilota "+nome+ " entra nello spogliatoio");

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return tempo;
    }

    public synchronized void esciSpogliatoio(){
        String nome= Thread.currentThread().getName();
        System.out.println("il pilota "+nome+ " esce dallo spogliatoio");
        spazioSpogliatoio--;
        notify();
    }



    
}

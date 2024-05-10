package com.example;

public class Pista {
    int kart=0;

    public synchronized void entra(){
        String nome= Thread.currentThread().getName();
        int tempo=0;
        try {
            while(kart>=4){
                wait();
            }

            //entra
            System.out.println("il pilota "+nome+ " sale sul go-Kart");
            kart++;
            
            for(int i=0;i<5;i++){
                tempo=1000+((int)(Math.random()*2000));
                Thread.sleep(tempo);
                System.out.println("il pilota "+nome+ " ha effettuato il giro: "+(i+1)+" e ci ha messo: "+ tempo/1000+" secondi");
            }

        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public synchronized  void esci(){
        String nome= Thread.currentThread().getName();
        System.out.println("il pilota "+nome+ " scende dal go-Kart");
        kart--;
        notify();
    }



}

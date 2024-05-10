package com.example;

public class Persone extends Thread{

    Spogliatoio s= new Spogliatoio();
    Pista p= new Pista();

    public Persone(Spogliatoio s, Pista p, String nome){
        super(nome);
        this.s= s;
        this.p=p;
    }

    //indossa
    //esce

    //entra

    //esci

    //entraSPogliatoio
    //toglie

    public void run(){
        int tempo=0;
        try{
        tempo= s.entraSpogliatoio();
        Thread.sleep(tempo);
        s.esciSpogliatoio();
        
        p.entra();
        p.esci();

        tempo= s.entraSpogliatoio();
        Thread.sleep(tempo);
        s.esciSpogliatoio();

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }

}

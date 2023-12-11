package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto{

    private int codiceIMEI;
    private int memoria;

    public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.memoria= memoria;
        codiceIMEI=randomIMEI();

    }

    public int getCodiceIMEI() {
        return codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    //Metodi

    private int randomIMEI(){
        Random random = new Random();
        return random.nextInt(10000, 100000);
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "codiceIMEI=" + codiceIMEI +
                ", memoria=" + memoria +
                '}';
    }
}

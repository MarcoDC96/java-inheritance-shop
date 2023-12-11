package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{

    private int dimensioni;
    private boolean smart;

    public Televisori(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, int dimensioni, boolean smart) {
        super(nome, descrizione, prezzo, iva);
        this.dimensioni=dimensioni;
        this.smart=smart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}

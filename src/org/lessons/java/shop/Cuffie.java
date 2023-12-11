package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    private String colore;
    private boolean wirless;

    public Cuffie(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String colore, boolean wirless) {
        super(nome, descrizione, prezzo, iva);
        this.colore=colore;
        this.wirless=wirless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWirless() {
        return wirless;
    }

    public void setWirless(boolean wirless) {
        this.wirless = wirless;
    }
}

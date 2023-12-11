package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    //Attributi
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    //Costruttore

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        codice= codiceProdotto();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    //Getter-Setter


    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    //Metodi

    private int codiceProdotto(){
        Random random = new Random();
        return random.nextInt(1000, 10000);
    }

    public BigDecimal getPrezzoConIva(){
        BigDecimal ivaPrezzo = prezzo.multiply(iva);
        return prezzo.add(ivaPrezzo).setScale(2, RoundingMode.HALF_EVEN);
    }


}

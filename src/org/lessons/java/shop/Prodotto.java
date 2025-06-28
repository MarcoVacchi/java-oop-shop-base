package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;

    public Prodotto(String name, String brand, BigDecimal price, BigDecimal iva) {

        this.code = new Random().nextInt(10000) + 10000;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;

    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getIva() {
        return this.iva.setScale(2, RoundingMode.DOWN);
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // public BigDecimal getPrice() {
    // return this.price;
    // };

    // public BigDecimal getIva() {
    // if (price != null && iva != null) {
    // return price.add(price.multiply(iva).setScale(2, RoundingMode.DOWN));
    // }
    // return null;
    // };

    // public String extendedName() {
    // if (name != null) {
    // return this.name = this.code + "-" + this.name;
    // }
    // return null;
    // };

};

// ESERCIZIO 2
// Creare la classe Prodotto che gestisce i prodotti dello shop.

// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - marca
// - prezzo
// - iva

// Usate opportunamente i livelli di accesso (public, private), i costruttori, i
// metodi getter e setter ed eventuali altri metodi di "utilità" per fare in
// modo che:
// - esistano almeno due costruttori diversi
// - il codice prodotto sia accessibile solo in lettura
// - gli altri attributi siano accessibili sia in lettura che in scrittura

// ESERCIZIO 1
// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva

// Usate opportunamente costruttori, attributi ed eventuali altri metodi di
// “utilità” per fare in modo che:
// - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero
// random
// - il prodotto esponga un metodo per avere il prezzo base
// - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
// - il prodotto esponga un metodo per avere il nome esteso, ottenuto
// concatenando codice-nome

// Nello stesso package aggiungete una classe Main con metodo main nella quale
// testate tutte le funzionalità della classe Prodotto.
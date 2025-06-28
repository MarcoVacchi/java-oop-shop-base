package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    public int code;
    public String name;
    public String description;
    public BigDecimal price;
    public BigDecimal iva;

    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva) {

        this.code = new Random().nextInt(10000) + 10000;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;

    };

    public BigDecimal getPrice() {
        return this.price;
    };

    public BigDecimal getIva() {
        if (price != null && iva != null) {
            return price.add(price.multiply(iva).setScale(2, RoundingMode.DOWN));
        }
        return null;
    };

    public String extendedName() {
        if (name != null) {
            return this.name = this.code + "-" + this.name;
        }
        return null;
    };

};

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
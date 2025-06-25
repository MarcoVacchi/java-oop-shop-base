package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int code;
    public String name;
    public String description;
    public float price;
    public double iva;

    public Prodotto(String name, String description, float price, double iva) {

        this.code = new Random().nextInt(10000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    };

    public float startPrice() {
        return this.price = 220;
    }

    public double priceIva() {
        return price * (1 + iva / 100);
    }

    public String extendedName() {
        return this.name = this.name + "-" + this.code;
    }

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
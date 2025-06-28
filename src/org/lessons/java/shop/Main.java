package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Prodotto telefono = new Prodotto(
                "4s",
                "i-phone",
                new BigDecimal(200),
                new BigDecimal(0.22));

        System.out.println(telefono.getName());
        System.out.println(telefono.getBrand());
        System.out.println(telefono.getCode());
        System.out.println(telefono.getIva());
        System.out.println(telefono.getPrice());

        telefono.setName("s-20");
        telefono.setBrand("Samsung");
        telefono.setIva(new BigDecimal(0.33));
        telefono.setPrice(new BigDecimal(2220));

        System.out.println(telefono.getName());
        System.out.println(telefono.getBrand());
        System.out.println(telefono.getCode());
        System.out.println(telefono.getIva());
        System.out.println(telefono.getPrice());

    }
}

// ESERCIZIO 1
// Prodotto telefono = new Prodotto(
// "Samsung",
// "Telefono innovativo",
// new BigDecimal(220), new BigDecimal(0.22));

// telefono.setName("marco");
// System.out.println(telefono.getName());

// // Prodotto climatizzatore = new Prodotto(
// // "climagas", "Condizionatore portatile",
// // new BigDecimal(220),
// // new BigDecimal(0.22));
// // System.out.println("Nome: " + telefono.code);
// // System.out.println("Nome: " + telefono.name);
// // System.out.println("Descrizione: " + telefono.description);
// // System.out.println("Prezzo: " + telefono.price);
// // System.out.println("Prezzo ivato: " + telefono.getIva());

// // System.out.println("Nome: " + climatizzatore.name);
// // System.out.println("Descrizione: " + climatizzatore.description);
// // System.out.println("Prezzo: " + climatizzatore.price);
// // System.out.println("Iva: " + climatizzatore.iva);
// // System.out.println("Prezzo ivato: " + climatizzatore.getIva());

package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Prodotto telefono = new Prodotto(
                "Samsung",
                "Telefono innovativo",
                new BigDecimal(220), new BigDecimal(0.22));

        Prodotto climatizzatore = new Prodotto(
                "climagas", "Condizionatore portatile",
                new BigDecimal(220),
                new BigDecimal(0.22));

        System.out.println("Nome: " + telefono.name);
        System.out.println("Descrizione: " + telefono.description);
        System.out.println("Prezzo: " + telefono.price);
        System.out.println("Prezzo ivato: " + telefono.getIva());

        // System.out.println("Nome: " + climatizzatore.name);
        // System.out.println("Descrizione: " + climatizzatore.description);
        // System.out.println("Prezzo: " + climatizzatore.price);
        // System.out.println("Iva: " + climatizzatore.iva);
        // System.out.println("Prezzo ivato: " + climatizzatore.getIva());

    }
}

package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto telefono = new Prodotto("samsung", "Samsung Galaxy s-20", 220f, 22.0);

        Prodotto climatizzatore = new Prodotto("climagas", "Condizionatore portatile", 2000f, 22.0);

        System.out.println("Nome: " + telefono.name);
        System.out.println("Descrizione: " + telefono.description);
        System.out.println("Prezzo: " + telefono.price);
        System.out.println("Iva: " + telefono.iva);
        System.out.println("Prezzo ivato: " + telefono.getIva());

        System.out.println("Nome: " + climatizzatore.name);
        System.out.println("Descrizione: " + climatizzatore.description);
        System.out.println("Prezzo: " + climatizzatore.price);
        System.out.println("Iva: " + climatizzatore.iva);
        System.out.println("Prezzo ivato: " + climatizzatore.getIva());

        // System.out.println(telefono.code);
        // System.out.println(telefono.description);

        // System.out.println("Prezzo ivato: " + telefono.getIva());
        // System.out.println("Prezzo base: " + climatizzatore.getPrice());
        // System.out.println("Prezzo ivato: " + climatizzatore.getIva());

        // System.out.println(climatizzatore.code);
        // System.out.println(climatizzatore.extendedName());

    }
}

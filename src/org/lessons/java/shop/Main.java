package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto telefono = new Prodotto("samsung", "Samsung Galaxy s-20", 220f, 22.0);

        Prodotto climatizzatore = new Prodotto("climagas", "Condizionatore portatile", 2000f, 22.0);

        System.out.println(telefono.code);
        System.out.println(telefono.description);

        System.out.println("Prezzo ivato: " + telefono.priceIva());

        System.out.println("Prezzo ivato: " + climatizzatore.priceIva());

        System.out.println(climatizzatore.code);
        System.out.println(climatizzatore.extendedName());

    }
}

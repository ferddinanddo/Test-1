package com.ibm.microservices;
import java.lang.System;

public class Main {
    public static void main(String[] args) {
        System.out.println("_____ Caja predeterminada _____");
        Caja cajaPredeterminada = new Caja();
        System.out.println("Caja   : " + cajaPredeterminada.toString());
        System.out.println("Volumen: " + cajaPredeterminada.calcularVolumen());

        System.out.println("_____ Caja 1 _____");
        Caja caja1 = new Caja(3, 2 , 6);
        System.out.println("Caja   : " + caja1.toString());
        System.out.println("Volumen: " + caja1.calcularVolumen());

        System.out.println("_____ Caja 2 _____");
        Caja caja2 = new Caja(9, 8 , 7);
        System.out.println("Caja   : " + caja2.toString());
        System.out.println("Volumen: " + caja2.calcularVolumen());
    }
}

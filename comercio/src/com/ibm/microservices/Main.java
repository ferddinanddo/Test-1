package com.ibm.microservices;

import java.util.ArrayList;
import java.lang.System;

public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        System.out.println("===== Almacen y verduleria =====");
        System.out.println("..... Agregando 2 Lacteros .....");
        productos.add(new Lacteo("Alpura", 20.0, 1, 3));
        productos.add(new Lacteo("Santa Clara", 30.0, 5, 4));

        System.out.println("..... Agregando 2 Frutas .....");
        productos.add(new Fruta("Naranja", 15.0, 1, "Naranja"));
        productos.add(new Fruta("Manzana", 20.0, 2, "Rojo"));

        System.out.println("..... Agregando 2 Productos de limpieza .....");
        productos.add(new Limpieza("Windex", 1.5, "Agua, fragancia", 1.5));
        productos.add(new Limpieza("Maestro Limpio", 20.0, "Agua, alquilbenceno", 2.0));

        System.out.println("..... Agregando 2 Productos no perecibles .....");
        productos.add(new NoPerecible("Atun", 15.0, 150, 170));
        productos.add(new NoPerecible("Fideos", 10.0, 200, 90));

        System.out.println("\n\n..... Lista de productos .....");
        for (Producto producto : productos) {
            System.out.println("+ " + producto.toString());
        }
    }
}

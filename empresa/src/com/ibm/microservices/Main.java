package com.ibm.microservices;
import java.lang.System;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Empresa =====");
        System.out.println("----- Creando gerente -----");
        Gerente gerente = new Gerente("Laura", "Herrera", "1592562", "Calle Dinamarca, Estado de Mexico, Mexico", 20000.0, 43825, 1500000.0);
        System.out.println(gerente.toString());
    }
}

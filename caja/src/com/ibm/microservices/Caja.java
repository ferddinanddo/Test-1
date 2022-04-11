package com.ibm.microservices;

import java.util.Objects;

public class Caja {
    private int ancho;
    private int alto;
    private int profundo;
    private static final int LONGITUD_PREDETERMINADA = 1;

    public Caja() {
        this.alto = LONGITUD_PREDETERMINADA;
        this.ancho = LONGITUD_PREDETERMINADA;
        this.profundo = LONGITUD_PREDETERMINADA;
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    public int calcularVolumen() {
        return alto * ancho * profundo;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundo=" + profundo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caja caja = (Caja) o;
        return alto == caja.alto && ancho == caja.ancho && profundo == caja.profundo;
    }
}

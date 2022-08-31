package com.company;

public class Main {

    public static void main(String[] args) {

        suma(15, 25, 48);

        Coche miCoche = new Coche();
        miCoche.aumentarCantidadPuertas();

        System.out.println(miCoche.puertas);

    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;

    public void aumentarCantidadPuertas() {
        this.puertas++;
    }
}

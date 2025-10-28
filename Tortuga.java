package com.mycompany.sistema.modelo;

public class Tortuga extends Animal {
    private double velocidadLenta;

    public Tortuga(String nombre, int edad, double peso, double velocidadLenta) {
        super(nombre, edad, peso);
        this.velocidadLenta = velocidadLenta;
    }

    public double getVelocidadLenta() {
        return velocidadLenta;
    }

    public void setVelocidadLenta(double velocidadLenta) {
        this.velocidadLenta = velocidadLenta;
    }

    public void caminarLento() {
        System.out.println(getNombre() + " camina lentamente a " + velocidadLenta + " m/min.");
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " hace: fuuuaa...");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Velocidad: " + velocidadLenta + " m/min");
    }
}

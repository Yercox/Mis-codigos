package com.mycompany.sistema.modelo;

public class Pajaro extends Animal {
    private double envergaduraAlas;

    public Pajaro(String nombre, int edad, double peso, double envergaduraAlas) {
        super(nombre, edad, peso);
        this.envergaduraAlas = envergaduraAlas;
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public void volar() {
        System.out.println(getNombre() + " vuela con sus alas de " + envergaduraAlas + " cm.");
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " canta: pío pío.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Envergadura de alas: " + envergaduraAlas + " cm");
    }
}

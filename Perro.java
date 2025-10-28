package com.mycompany.sistema.modelo;

public class Perro extends Animal {
    private String pelaje;

    public Perro(String nombre, int edad, double peso, String pelaje) {
        super(nombre, edad, peso);
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void buscar() {
        System.out.println(getNombre() + " está buscando huesos...");
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " dice: ¡guau guau!");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Color del pelaje: " + pelaje);
    }
}

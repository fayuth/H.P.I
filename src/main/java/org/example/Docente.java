package org.example;

public class Docente extends Persona {

    private String especialidad;

    public Docente(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("DOCENTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especialidad: " + especialidad);
    }
}

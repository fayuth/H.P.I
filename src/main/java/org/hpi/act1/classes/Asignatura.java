package org.hpi.act1.classes;

public class Asignatura {

    private String nombre;
    private int creditos;

    public Asignatura(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void mostrarAsignatura() {
        System.out.println("Asignatura: " + nombre);
        System.out.println("Créditos: " + creditos);
    }
}

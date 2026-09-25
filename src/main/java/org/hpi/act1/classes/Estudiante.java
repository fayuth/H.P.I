package org.hpi.act1.classes;

public class Estudiante extends Persona {

    private int codigo;
    private int semestre;

    public Estudiante(String nombre, int edad, int codigo, int semestre) {
        super(nombre, edad);
        this.codigo = codigo;
        this.semestre = semestre;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ESTUDIANTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
}

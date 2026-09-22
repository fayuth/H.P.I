package org.example;

public class RegistroAcademico implements GestionAcademica {

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        System.out.println("Estudiante registrado correctamente.");
        estudiante.mostrarDatos();
    }

    public void registrarEstudiante(String nombre, int edad) {
        System.out.println("Estudiante registrado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    @Override
    public void registrarDocente(Docente docente) {
        System.out.println("Docente registrado correctamente.");
        docente.mostrarDatos();
    }

    @Override
    public void registrarAsignatura(Asignatura asignatura) {
        System.out.println("Asignatura registrada correctamente.");
        asignatura.mostrarAsignatura();
    }
}

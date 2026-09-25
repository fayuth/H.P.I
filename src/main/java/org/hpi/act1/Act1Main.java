package org.hpi.act1;

import org.hpi.act1.classes.*;


public class Act1Main {

    public void menu1() {

        RegistroAcademico registro = new RegistroAcademico();

        Estudiante estudiante = new Estudiante(
                "Fayuth",
                20,
                1001,
                2
        );

        Docente docente = new Docente(
                "Cristian",
                35,
                "Programación"
        );

        Asignatura asignatura = new Asignatura(
                "Programación Orientada a Objetos",
                3
        );

        System.out.println("===== SISTEMA ACADÉMICO =====");

        registro.registrarEstudiante(estudiante);

        System.out.println();

        registro.registrarDocente(docente);

        System.out.println();

        registro.registrarAsignatura(asignatura);

        System.out.println();

        registro.registrarEstudiante("Jesus", 19);

        System.out.println();

        Persona persona1 = estudiante;
        Persona persona2 = docente;

        persona1.mostrarDatos();

        System.out.println();

        persona2.mostrarDatos();
    }
}

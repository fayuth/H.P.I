package org.hpi.act1.interfac;

import org.hpi.act1.classes.Asignatura;
import org.hpi.act1.classes.Docente;
import org.hpi.act1.classes.Estudiante;

public interface GestionAcademica {

    void registrarEstudiante(Estudiante estudiante);

    void registrarDocente(Docente docente);

    void registrarAsignatura(Asignatura asignatura);
}

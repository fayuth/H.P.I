package org.hpi.act2.interfac;

import org.hpi.act2.classes.Empleado;

public interface CalculadorComision {

    double calcularComision(Empleado empleado, String mes);

    double calcularBono(int cantidadVentas);
}
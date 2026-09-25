package org.hpi.act2.classes;

import org.hpi.act2.interfac.CalculadorComision;

import java.util.List;

public class CalculadoraComision implements CalculadorComision {

    @Override
    public double calcularComision(Empleado empleado, String mes) {
        List<Venta> ventasDelMes = empleado.getVentas(mes);
        double total = 0;
        for (Venta venta : ventasDelMes) {
            total += venta.getPropiedad().getPrecio() * venta.getPropiedad().getPorcentajeComision();
        }
        return total * calcularBono(ventasDelMes.size());
    }

    public double calcularComision(Empleado empleado) {
        double total = 0;
        for (Venta venta : empleado.getVentas()) {
            total += venta.getPropiedad().getPrecio() * venta.getPropiedad().getPorcentajeComision();
        }
        return total;
    }

    public double calcularComision(Empleado empleado, String mes, double factorExtra) {
        return calcularComision(empleado, mes) * factorExtra;
    }

    @Override
    public double calcularBono(int cantidadVentas) {
        if (cantidadVentas >= 10) {
            return 1.25;
        }
        if (cantidadVentas >= 5) {
            return 1.10;
        }
        return 1.0;
    }
}
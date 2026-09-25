package org.hpi.act2.classes;

import org.hpi.act2.classes.type.Propiedad;

import java.util.Locale;

public class Venta {

    private final int id;
    private final Empleado vendedor;
    private final Propiedad propiedad;
    private final String mes;

    public Venta(int id, Empleado vendedor, Propiedad propiedad, String mes) {
        this.id = id;
        this.vendedor = vendedor;
        this.propiedad = propiedad;
        this.mes = mes;
    }

    public int getId() {
        return id;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public String getMes() {
        return mes;
    }

    public void mostrarVenta() {
        System.out.println("Venta #" + id + " | " + propiedad.getClass().getSimpleName()
                + " | $" + String.format(Locale.US, "%,.2f", propiedad.getPrecio()) + " | Mes: " + mes);
    }
}
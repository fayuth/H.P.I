package org.hpi.act2.classes.type;

import java.util.Locale;

public abstract class Propiedad {

    protected String direccion;
    protected double precio;

    public Propiedad(String direccion) {
        this.direccion = direccion;
        this.precio = 0;
    }

    public Propiedad(String direccion, double precio) {
        this.direccion = direccion;
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract double getPorcentajeComision();

    public void mostrarDetalles() {
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio: $" + String.format(Locale.US, "%,.2f", precio));
    }
}
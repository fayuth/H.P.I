package org.hpi.act2.classes.type;

public class Apartamento extends Propiedad {

    public Apartamento(String direccion, double precio) {
        super(direccion, precio);
    }

    @Override
    public double getPorcentajeComision() {
        return 0.02;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("TIPO: APARTAMENTO");
        super.mostrarDetalles();
        System.out.println("Comisión: " + (getPorcentajeComision() * 100) + "%");
    }
}
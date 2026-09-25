package org.hpi.act2.classes.type;

public class Lote extends Propiedad {

    public Lote(String direccion, double precio) {
        super(direccion, precio);
    }

    @Override
    public double getPorcentajeComision() {
        return 0.015;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("TIPO: LOTE");
        super.mostrarDetalles();
        System.out.println("Comisión: " + (getPorcentajeComision() * 100) + "%");
    }
}
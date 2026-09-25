package org.hpi.act2.classes.type;

public class Casa extends Propiedad {

    public Casa(String direccion, double precio) {
        super(direccion, precio);
    }

    @Override
    public double getPorcentajeComision() {
        return 0.03;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("TIPO: CASA");
        super.mostrarDetalles();
        System.out.println("Comisión: " + (getPorcentajeComision() * 100) + "%");
    }
}
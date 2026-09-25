package org.hpi.act2.classes;

import org.hpi.act1.classes.Persona;
import org.hpi.act2.classes.type.Propiedad;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {

    private final String cargo;
    private final List<Venta> ventas;

    public Empleado(String nombre, int edad) {
        super(nombre, edad);
        this.cargo = "Vendedor";
        this.ventas = new ArrayList<>();
    }

    public Empleado(String nombre, int edad, String cargo) {
        super(nombre, edad);
        this.cargo = cargo;
        this.ventas = new ArrayList<>();
    }

    public String getCargo() {
        return cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    public void registrarVenta(int id, Propiedad propiedad, String mes) {
        registrarVenta(new Venta(id, this, propiedad, mes));
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public List<Venta> getVentas(String mes) {
        List<Venta> ventasDelMes = new ArrayList<>();
        for (Venta venta : ventas) {
            if (venta.getMes().equalsIgnoreCase(mes)) {
                ventasDelMes.add(venta);
            }
        }
        return ventasDelMes;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("EMPLEADO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cargo: " + cargo);
        System.out.println("Ventas registradas: " + ventas.size());
    }
}
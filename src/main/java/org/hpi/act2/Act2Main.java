package org.hpi.act2;

import org.hpi.act1.classes.Persona;
import org.hpi.act2.classes.*;
import org.hpi.act2.classes.type.Apartamento;
import org.hpi.act2.classes.type.Casa;
import org.hpi.act2.classes.type.Lote;
import org.hpi.act2.classes.type.Propiedad;
import org.hpi.act2.interfac.CalculadorComision;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Act2Main {

    private final CalculadorComision contrato = new CalculadoraComision();
    private final CalculadoraComision calculadora = new CalculadoraComision();
    private final Empleado ana = new Empleado("Ana", 30, "Asesora Senior");
    private final Empleado pedro = new Empleado("Pedro", 25);
    private final List<Propiedad> inventario;

    public Act2Main() {
        Propiedad casa = new Casa("Cra 12 #45-70", 120_000_000);
        Propiedad apartamento = new Apartamento("Calle 8 #20-11", 80_000_000);
        Propiedad lote1 = new Lote("Km 5 vía Chía", 40_000_000);
        Propiedad lote2 = new Lote("Km 7 vía Chía", 60_000_000);

        ana.registrarVenta(1, casa, "Enero");
        ana.registrarVenta(2, apartamento, "Enero");

        pedro.registrarVenta(3, new Casa("Cra 1 #2-3", 100_000_000), "Enero");
        pedro.registrarVenta(4, new Casa("Cra 1 #4-5", 100_000_000), "Enero");
        pedro.registrarVenta(5, new Casa("Cra 2 #6-7", 100_000_000), "Enero");
        pedro.registrarVenta(6, new Casa("Cra 2 #8-9", 100_000_000), "Enero");
        pedro.registrarVenta(7, lote1, "Enero");
        pedro.registrarVenta(8, lote2, "Enero");

        inventario = List.of(casa, apartamento, lote1, lote2);
    }

    public void menu2(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("Ventas y Comisiones");
            System.out.println("1. Ver ventas de Ana");
            System.out.println("2. Ver ventas de Pedro");
            System.out.println("3. Calcular comisiones mensuales (Enero)");
            System.out.println("4. Sobrecarga de métodos");
            System.out.println("5. Polimorfismo de Propiedad");
            System.out.println("6. Polimorfismo de Persona");
            System.out.println("0. Volver al menú principal");
            System.out.println(" ");
            System.out.print("Opción: ");

            int opcion = leerEntero(scanner);

            switch (opcion) {
                case 1 -> verVentas(ana);
                case 2 -> verVentas(pedro);
                case 3 -> calcularComisiones();
                case 4 -> sobrecargaDeMetodos();
                case 5 -> polimorfismoDePropiedad();
                case 6 -> polimorfismoDePersona();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    private static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Opción inválida. Ingresa un número.");
            scanner.next();
            System.out.print("Opción: ");
        }
        return scanner.nextInt();
    }

    private void verVentas(Empleado empleado) {
        System.out.println();
        System.out.println("--- Ventas de " + empleado.getCargo() + " " + empleado.getNombre() + " ---");
        for (Venta venta : empleado.getVentas("Enero")) {
            venta.mostrarVenta();
        }
    }

    private void calcularComisiones() {
        System.out.println();
        System.out.println("Comisión de Ana en Enero: $"
                + String.format(Locale.US, "%,.2f", calculadora.calcularComision(ana, "Enero")));
        System.out.println("Bono por volumen de Pedro (6 ventas): x" + calculadora.calcularBono(6));
        System.out.println("Comisión de Pedro en Enero: $"
                + String.format(Locale.US, "%,.2f", calculadora.calcularComision(pedro, "Enero")));
    }

    private void sobrecargaDeMetodos() {
        System.out.println();
        System.out.println("calcularComision(Empleado, String) — Ana en Enero: $"
                + String.format(Locale.US, "%,.2f", calculadora.calcularComision(ana, "Enero")));
        System.out.println("calcularComision(Empleado) — Ana sin filtrar mes: $"
                + String.format(Locale.US, "%,.2f", calculadora.calcularComision(ana)));
        System.out.println("calcularComision(Empleado, String, double) — Ana en Enero x1.2: $"
                + String.format(Locale.US, "%,.2f", calculadora.calcularComision(ana, "Enero", 1.2)));
        System.out.println("Interfaz (referencia por contrato) — Pedro en Enero: $"
                + String.format(Locale.US, "%,.2f", contrato.calcularComision(pedro, "Enero")));
    }

    private void polimorfismoDePropiedad() {
        System.out.println();
        for (Propiedad propiedad : inventario) {
            propiedad.mostrarDetalles();
            System.out.println();
        }
    }

    private void polimorfismoDePersona() {
        System.out.println();
        Persona persona = ana;
        persona.mostrarDatos();
    }
}
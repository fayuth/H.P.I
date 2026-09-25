package org.hpi;

import org.hpi.act1.Act1Main;
import org.hpi.act2.Act2Main;

import java.util.Scanner;

public class Menus {

    public static void main(String[] args) {
        main();
    }

    public static void main() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println(" H.P.I ");
            System.out.println("1. Sistema Académico (Taller 1)");
            System.out.println("2. Sistema de Ventas y Comisiones (Taller 2)");
            System.out.println("0. Salir");
            System.out.println(" ");
            System.out.print("Opción: ");

            int opcion = leerEntero(scanner);

            switch (opcion) {
                case 1 -> new Act1Main().menu1();
                case 2 -> new Act2Main().menu2(scanner);
                case 0 -> {
                    System.out.println("¡bye iauphogtfeigae!");
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
}
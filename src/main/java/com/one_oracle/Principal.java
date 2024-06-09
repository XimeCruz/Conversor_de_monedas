package com.one_oracle;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaConversor consultaConversor = new ConsultaConversor();

        // Agregar las monedas que queremos usar
        consultaConversor.agregarMoneda("USD");
        consultaConversor.agregarMoneda("ARS");
        consultaConversor.agregarMoneda("BOB");
        consultaConversor.agregarMoneda("BRL");
        consultaConversor.agregarMoneda("CLP");
        consultaConversor.agregarMoneda("COP");

        // Obtener las tasas de cambio para USD
        try {
            consultaConversor.obtenerTasasDeCambio("USD");
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener las tasas de cambio: " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("*************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("*************************************");

            int opcion = scanner.nextInt();
            if (opcion == 7) {
                break;
            }

            System.out.println("Ingrese el valor que deseas convertir:");
            double valor = scanner.nextDouble();
            double tasaDeCambio = 0;
            String monedaOrigen = "";
            String monedaDestino = "";

            switch (opcion) {
                case 1:
                    tasaDeCambio = consultaConversor.obtenerTasaDeCambio("USD", "ARS");
                    monedaOrigen = "USD";
                    monedaDestino = "ARS";
                    break;
                case 2:
                    tasaDeCambio = consultaConversor.obtenerTasaDeCambio("ARS", "USD");
                    monedaOrigen = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    tasaDeCambio = consultaConversor.obtenerTasaDeCambio("USD", "BRL");
                    monedaOrigen = "USD";
                    monedaDestino = "BRL";
                    break;
                case 4:
                    tasaDeCambio = consultaConversor.obtenerTasaDeCambio("BRL", "USD");
                    monedaOrigen = "BRL";
                    monedaDestino = "USD";
                    break;
                case 5:
                    tasaDeCambio = consultaConversor.obtenerTasaDeCambio("USD", "COP");
                    monedaOrigen = "USD";
                    monedaDestino = "COP";
                    break;
                case 6:
                    tasaDeCambio = consultaConversor.obtenerTasaDeCambio("COP", "USD");
                    monedaOrigen = "COP";
                    monedaDestino = "USD";
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
            }

            double resultado = valor * tasaDeCambio;
            System.out.println("El valor " + valor + " [" + monedaOrigen + "] corresponde al valor final de >>> " + resultado + " [" + monedaDestino + "]");
            System.out.println("*************************************");
        }

        scanner.close();
    }
}

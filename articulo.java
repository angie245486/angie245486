import java.util.Scanner;

// Definición de la clase Articulo
class Articulo {
    private double valor;
    private double iva;
    private int cantidad;

    // Constructor
    public Articulo(double valor, double iva, int cantidad) {
        this.valor = valor;
        this.iva = iva;
        this.cantidad = cantidad;
    }

    // Método para calcular el total a pagar en efectivo con descuento del 15%
    public double totalPagarEfectivo() {
        double totalSinIVA = valor * cantidad;
        double totalConIVA = totalSinIVA + (totalSinIVA * iva);
        return totalConIVA * 0.85; // Aplicar 15% de descuento
    }

    // Método para calcular el total a pagar con tarjeta de débito con descuento del 10%
    public double totalPagarDebito() {
        double totalSinIVA = valor * cantidad;
        double totalConIVA = totalSinIVA + (totalSinIVA * iva);
        return totalConIVA * 0.90; // Aplicar 10% de descuento
    }

    // Método para calcular el total a pagar con tarjeta de crédito con descuento del 5%
    public double totalPagarCredito() {
        double totalSinIVA = valor * cantidad;
        double totalConIVA = totalSinIVA + (totalSinIVA * iva);
        return totalConIVA * 0.95; // Aplicar 5% de descuento
    }
}

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del artículo:");
        double valor = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje del IVA:");
        double iva = scanner.nextDouble() / 100; // Convertir porcentaje a fracción

        System.out.println("Ingrese la cantidad de artículos:");
        int cantidad = scanner.nextInt();

        // Crear un objeto Articulo con los datos ingresados
        Articulo articulo = new Articulo(valor, iva, cantidad);

        // Calcular el total a pagar según el método de pago y mostrarlo
        System.out.println("Total a pagar en efectivo con descuento del 15%: $" + articulo.totalPagarEfectivo());
        System.out.println("Total a pagar con tarjeta de débito con descuento del 10%: $" + articulo.totalPagarDebito());
        System.out.println("Total a pagar con tarjeta de crédito con descuento del 5%: $" + articulo.totalPagarCredito());

        scanner.close();
    }
}

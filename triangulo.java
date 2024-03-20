import java.util.Scanner;

// Definición de la clase Triangulo
class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Método para determinar si el triángulo es isósceles
    public boolean esIsosceles() {
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }

    // Método para determinar si el triángulo es equilátero
    public boolean esEquilatero() {
        return lado1 == lado2 && lado1 == lado3;
    }

    // Método para determinar si el triángulo es escaleno
    public boolean esEscaleno() {
        return !esIsosceles() && !esEquilatero();
    }
}

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer lado del triángulo:");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo lado del triángulo:");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer lado del triángulo:");
        double lado3 = scanner.nextDouble();

        // Crear un objeto Triangulo con los lados ingresados
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        // Determinar y mostrar si el triángulo es isósceles
        if (triangulo.esIsosceles()) {
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo no es isósceles");
        }

        // Determinar y mostrar si el triángulo es equilátero
        if (triangulo.esEquilatero()) {
            System.out.println("El triángulo es equilátero");
        } else {
            System.out.println("El triángulo no es equilátero");
        }

        // Determinar y mostrar si el triángulo es escaleno
        if (triangulo.esEscaleno()) {
            System.out.println("El triángulo es escaleno");
        } else {
            System.out.println("El tri

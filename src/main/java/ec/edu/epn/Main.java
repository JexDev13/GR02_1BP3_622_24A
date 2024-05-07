package ec.edu.epn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido a la aplicación de operaciones matemáticas.");
            System.out.println("Por favor seleccione la operación que desea realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.print("Ingrese su elección (1-5): ");
            int choice = scanner.nextInt();


            int num1, num2;

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el primer número para sumar: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número para sumar: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado de la suma es: " + calculator.sum(num1, num2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número para restar: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número para restar: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado de la resta es: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número para multiplicar: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número para multiplicar: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado de la multiplicación es: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Ingrese el dividendo (número a dividir): ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el divisor (número divisor): ");
                    num2 = scanner.nextInt();
                    try {
                        System.out.println("El resultado de la división es: " + calculator.divide(num1, num2));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor ingrese un número del 1 al 4.");
                    break;
            }
        }

        scanner.close();
    }
}

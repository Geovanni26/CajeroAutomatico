package proyectoExamenCajero;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Implementacion banco = new Implementacion();
        int opcion;

        do {
            System.out.println("MENU BANCOMER BIENVENIDO");
            System.out.println("1. Alta cliente");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Deposito en efectivo");
            System.out.println("4. Retiro en efectivo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de cuenta: ");
                    String numCuenta = scanner.next();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.next();
                    banco.altaCliente(numCuenta, nombre);
                    break;
                case 2:
                    System.out.print("Ingrese el número de cuenta: ");
                    numCuenta = scanner.next();
                    banco.consultarSaldo(numCuenta);
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta: ");
                    numCuenta = scanner.next();
                    System.out.print("Ingrese el monto a depositar: ");
                    float deposito = scanner.nextFloat();
                    banco.deposito(numCuenta, deposito);
                    break;
                case 4:
                    System.out.print("Ingrese el número de cuenta: ");
                    numCuenta = scanner.next();
                    System.out.print("Ingrese el monto a retirar: ");
                    float retiro = scanner.nextFloat();
                    banco.retiro(numCuenta, retiro);
                    break;
                case 5:
                    System.out.println("Gracias por usar el cajero automático.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}


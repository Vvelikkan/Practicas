package AbstractClass;

import java.util.Scanner;
// Clase abstracta para la categoría de Vehículos
abstract class Vehiculo {
    public abstract void mostrarTipos();
}

// Clase concreta para Vehículos Aéreos
class Aereo extends Vehiculo {
    @Override
    public void mostrarTipos() {
        System.out.println("Tipos de vehículos aéreos:");
        System.out.println("1. Avión");
        System.out.println("2. Helicóptero");
        System.out.println("3. Parapente");
        System.out.println("4. Avioneta");
        System.out.println("5. Paracaídas");
    }
}

// Clase concreta para Vehículos Terrestres
class Terrestre extends Vehiculo {
    @Override
    public void mostrarTipos() {
        System.out.println("Tipos de vehículos terrestres:");
        System.out.println("1. Auto");
        System.out.println("2. Camión");
        System.out.println("3. Bicicleta");
        System.out.println("4. Piernas");
    }
}

// Clase concreta para Vehículos Marítimos
class Maritimo extends Vehiculo {
    @Override
    public void mostrarTipos() {
        System.out.println("Tipos de vehículos marítimos:");
        System.out.println("1. Lancha");
        System.out.println("2. Submarino");
        System.out.println("3. Bote");
    }
}

// Clase concreta para Vehículos Espaciales
class Espacial extends Vehiculo {
    @Override
    public void mostrarTipos() {
        System.out.println("Tipos de vehículos espaciales:");
        System.out.println("1. Transbordador");
        System.out.println("2. Cohete");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Seleccione la categoría de vehículo:");
            System.out.println("1. Aéreo");
            System.out.println("2. Terrestre");
            System.out.println("3. Marítimo");
            System.out.println("4. Espacial");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 5) {
                break; // Salir del bucle si se selecciona la opción 5
            }

            Vehiculo vehiculo;

            switch (opcion) {
                case 1:
                    vehiculo = new Aereo();
                    break;
                case 2:
                    vehiculo = new Terrestre();
                    break;
                case 3:
                    vehiculo = new Maritimo();
                    break;
                case 4:
                    vehiculo = new Espacial();
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    continue;
            }

            vehiculo.mostrarTipos();
        }

        scanner.close();
    }
}

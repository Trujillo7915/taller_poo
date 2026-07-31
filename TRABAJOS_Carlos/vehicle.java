/* Una empresa de alquiler de vehículos registra cada automóvil con su placa, marca, modelo y cantidad de combustible. El sistema debe permitir mostrar la información del vehículo, encenderlo, apagarlo y registrar recorridos que disminuyan el combustible disponible.
*/

import java.util.Scanner;
class vehicle {
    String license_plate = "";
    String brand = "";
    String model = "";
    double fuel_quantity = 0.0;
    boolean is_on = false;
    Scanner sc = new Scanner(System.in);

    void showinfo() {
        System.out.println("Ingrese la placa del vehículo: ");
        license_plate = sc.nextLine();
        System.out.println("Ingrese la marca del vehículo: ");
        brand = sc.nextLine();
        System.out.println("Ingrese el modelo del vehículo: ");
        model = sc.nextLine();
        System.out.println("Ingrese la cantidad de combustible disponible: ");
        fuel_quantity = sc.nextDouble();
    }

    void turnOn() {
        if (!is_on) {
            is_on = true;
            System.out.println("El vehículo está encendido.");
        } else {
            System.out.println("El vehículo ya está encendido.");
        }
    }

    void turnOff() {
        if (is_on) {
            is_on = false;
            System.out.println("El vehículo está apagado.");
        } else {
            System.out.println("El vehículo ya está apagado.");
        }
    }

    void drive(double distance) {
        if (is_on) {
            double fuel_consumed = distance * 0.1; // Suponiendo que consume 0.1 litros por km
            if (fuel_quantity >= fuel_consumed) {
                fuel_quantity -= fuel_consumed;
                System.out.println("Recorrido realizado. Combustible restante: " + fuel_quantity + " litros.");
            } else {
                System.out.println("Combustible insuficiente para realizar el recorrido.");
            }
        } else {
            System.out.println("El vehículo debe estar encendido para conducir.");
        }
    }

    public static void main(String[] args) {
        vehicle vehicle = new vehicle();
        vehicle.showinfo();

        vehicle.turnOn();
        vehicle.drive(50); // Ejemplo de recorrido de 50 km
        vehicle.turnOff();
    }
}

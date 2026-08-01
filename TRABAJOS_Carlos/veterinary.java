/*  Una clínica veterinaria registra las mascotas de sus clientes. De cada mascota almacena el nombre, la especie, la edad, el peso y el nombre del propietario. El sistema debe permitir mostrar la información y registrar consultas médicas. Una mascota no puede tener un peso negativo ni una edad menor que cero. */

import java.util.Scanner;
public class veterinary {
    private String name= "";
    private String species= "";
    private int age= 0;
    private double weight= 0.0;
    private String ownerName= "";
    Scanner sc = new Scanner(System.in);

    public void inputData() {
        System.out.println("Ingrese el nombre de la mascota: ");
        name = sc.nextLine();

        System.out.println("Ingrese la especie de la mascota: ");
        species = sc.nextLine();

        System.out.println("Ingrese la edad de la mascota en meses: ");
        age = sc.nextInt();
        if (age < 0) {
            System.out.println("La edad no puede ser menor que cero. Ingrese nuevamente: ");
            age = sc.nextInt();
        }

        System.out.println("Ingrese el peso de la mascota: ");
        weight = sc.nextDouble();
        if (weight < 0) {
            System.out.println("El peso no puede ser negativo. Ingrese nuevamente: ");
            weight = sc.nextDouble();
        }

        sc.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el nombre del propietario: ");
        ownerName = sc.nextLine();
    }

    public void displayInfo() {
        System.out.println("Nombre de la mascota: " + name);
        System.out.println("Especie: " + species);
        System.out.println("Edad: " + age);
        System.out.println("Peso: " + weight);
        System.out.println("Nombre del propietario: " + ownerName);
    }
}

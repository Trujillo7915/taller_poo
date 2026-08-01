/*  Una empresa registra a sus empleados. De cada uno almacena el nombre, el cargo, el salario base y la cantidad de horas extras trabajadas durante el mes. El sistema debe permitir mostrar la información y calcular el salario final considerando el pago de las horas extras. */

import java.util.Scanner;
public class employee {
    private String name= "";
    private String position= "";
    private double baseSalary= 0.0;
    private int extraHours= 0;
    Scanner sc = new Scanner(System.in);

    public void inputData() {
        System.out.println("Ingrese el nombre del empleado: ");
        name = sc.nextLine();

        System.out.println("Ingrese el cargo del empleado: ");
        position = sc.nextLine();

        System.out.println("Ingrese el salario base del empleado: ");
        baseSalary = sc.nextDouble();

        System.out.println("Ingrese la cantidad de horas extras trabajadas durante el mes: ");
        extraHours = sc.nextInt();
    }

    public void displayInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Cargo: " + position);
        System.out.println("Salario base: " + baseSalary);
        System.out.println("Horas extras: " + extraHours);
    }
    public double calculateExtraPayment() {
        return extraHours * 20000; // Suponiendo que se paga $20 por hora extra
    }

    public double calculateFinalSalary() {
        double extraPayment = calculateExtraPayment();
        return baseSalary + extraPayment;
    }
  public static void main(String[] args) {
        employee emp = new employee();
        emp.inputData();
        emp.displayInfo();
        double finalSalary = emp.calculateFinalSalary();
        System.out.println("Salario final: " + finalSalary);
    }
}

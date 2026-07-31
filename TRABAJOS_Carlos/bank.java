/*  Banco desea registrar clientes con los siguientes criterios: 
    numero_de_cuenta
    nombre_titular
    saldo
    ------------------------
    Desea mostrar información de los clientes registrados
    ------------------------
    El sistema debe permitir mostrar la información de la cuenta, realizar depósitos y retiros, actualizando el saldo después de cada operación.
    ------------------------
    */

import java.util.Scanner;

public class bank {
    String account_number = "";
    String account_holder = "";
    double balance = 0.0;
    Scanner sc = new Scanner(System.in);
    int option_retiro = 0;

    void showinfo() {
        System.out.println("Ingrese Número de cuenta: ");
        account_number = sc.nextLine();
        System.out.println("Ingrese Nombre del titular: ");
        account_holder = sc.nextLine();
        System.out.println("Ingrese Saldo: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        System.out.print("Ingrese el monto a depositar: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Depósito realizado. Nuevo saldo: " + balance);
    }

    void withdraw() {
        System.out.print("Ingrese el monto a retirar: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Retiro realizado. Nuevo saldo: " + balance);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public static void main(String[] args) {
        bank bank = new bank();
        bank.showinfo();

        System.out.println("Seleccione una opción:");
        System.out.println("1. Depósito");
        System.out.println("2. Retiro");
        System.out.print("3. Salir");
        bank.option_retiro = bank.sc.nextInt();

        if(bank.option_retiro == 1) {
            bank.deposit();
            System.out.println("Nuevo saldo después del depósito: " + bank.balance);
        } else if (bank.option_retiro == 2) {
            bank.withdraw();
            System.out.println("Nuevo saldo después del retiro: " + bank.balance);
        } else if (bank.option_retiro == 3) {
            System.out.println("Saliendo del sistema.");
        } else {
            System.out.println("Opción no válida.");
        }
    }
}

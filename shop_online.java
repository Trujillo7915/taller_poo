/* Tienda en línea
Una tienda virtual necesita registrar las compras realizadas por sus clientes. Cada cliente tiene un nombre, un correo electrónico y un número de identificación. Cada compra posee un número, una fecha y una lista de productos. De cada producto se conoce el nombre, el precio y la cantidad comprada. El sistema debe permitir mostrar toda la información de la compra y calcular el valor total que debe pagar el cliente.
*/

import java.util.Scanner;

public class shop_online {
    String customer_name = "";
    String customer_email = "";
    String customer_id = "";
    String purchase_number = "";
    String purchase_date = "";
    String product_name = "";
    double product_price = 0.0;
    int product_quantity = 0;
    Scanner sc = new Scanner(System.in);

    void showPurchaseInfo() {
        System.out.println("Ingrese Nombre del cliente: ");
        customer_name = sc.nextLine();
        System.out.println("Ingrese Correo electrónico del cliente: ");
        customer_email = sc.nextLine();
        System.out.println("Ingrese Número de identificación del cliente: ");
        customer_id = sc.nextLine();
        System.out.println("Ingrese Número de compra: ");
        purchase_number = sc.nextLine();
        System.out.println("Ingrese Fecha de la compra: ");
        purchase_date = sc.nextLine();
        System.out.println("Ingrese Nombre del producto: ");
        product_name = sc.nextLine();
        System.out.println("Ingrese Precio del producto: ");
        product_price = sc.nextDouble();
        System.out.println("Ingrese Cantidad comprada del producto: ");
        product_quantity = sc.nextInt();
    }

    void displayPurchaseDetails() {
        double total_value = product_price * product_quantity;
        System.out.println("Detalles de la Compra:");
        System.out.println("Nombre del cliente: " + customer_name);
        System.out.println("Correo electrónico del cliente: " + customer_email);
        System.out.println("Número de identificación del cliente: " + customer_id);
        System.out.println("Número de compra: " + purchase_number);
        System.out.println("Fecha de la compra: " + purchase_date);
        System.out.println("Nombre del producto: " + product_name);
        System.out.println("Precio del producto: " + product_price);
        System.out.println("Cantidad comprada del producto: " + product_quantity);
        System.out.println("Valor total a pagar por el cliente: " + total_value);
    }

    public static void main(String[] args) {
        shop_online online_store = new shop_online();
        online_store.showPurchaseInfo();
        online_store.displayPurchaseDetails();
    }    
}

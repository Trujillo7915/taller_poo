/* Restaurant class 
Un restaurante necesita registrar sus pedidos. Cada pedido tiene un número, una fecha y un cliente. Además, cada pedido corresponde a un plato, del cual se conoce el nombre y el precio. El sistema debe mostrar toda la información del pedido junto con los datos del plato.
*/
import java.util.Scanner;

public class restaurant {
    String order_number = "";
    String order_date = "";
    String customer_name = "";
    String dish_name = "";
    double dish_price = 0.0;
    Scanner sc = new Scanner(System.in);

    void showOrderInfo() {
        System.out.println("Ingrese Número de pedido: ");
        order_number = sc.nextLine();
        System.out.println("Ingrese Fecha del pedido: ");
        order_date = sc.nextLine();
        System.out.println("Ingrese Nombre del cliente: ");
        customer_name = sc.nextLine();
        System.out.println("Ingrese Nombre del plato: ");
        dish_name = sc.nextLine();
        System.out.println("Ingrese Precio del plato: ");
        dish_price = sc.nextDouble();
    }

    void displayOrderDetails() {
        System.out.println("Detalles del Pedido:");
        System.out.println("Número de pedido: " + order_number);
        System.out.println("Fecha del pedido: " + order_date);
        System.out.println("Nombre del cliente: " + customer_name);
        System.out.println("Nombre del plato: " + dish_name);
        System.out.println("Precio del plato: " + dish_price);
    }

    public static void main(String[] args) {
        restaurant restaurant = new restaurant();
        restaurant.showOrderInfo();
        restaurant.displayOrderDetails();
    }    
}

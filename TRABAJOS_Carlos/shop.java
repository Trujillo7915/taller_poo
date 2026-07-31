/*  Tienda necesita registrar productos con los siguientes criterios: 
    nombre
    precio
    cantidad
    ------------------------
    Desea mostrar información de los productos registrados
    ------------------------
    Desea calcular el valor total del inventario de ese producto
    ------------------------
    */
import java.util.Scanner;
    

public class shop{
    String name="";
    double price=0.0;
    int quantity=0;
    Scanner sc = new Scanner(System.in);

    void showinfo(){
        System.out.println("Ingrese Nombre: " );
        name = sc.nextLine();
        System.out.println("Ingrese Precio unitario: " );
        price = sc.nextDouble();
        System.out.println("Ingrese Cantidad: " );
        quantity = sc.nextInt();
    }
    void totalvalue(){
        double total = price * quantity;
        System.out.println("El valor total del inventario es: " + total);
    }

    public static void main(String[] args) {
        shop shop = new shop();
        shop.showinfo();
        shop.totalvalue();
    }
    
}
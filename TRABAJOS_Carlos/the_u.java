/*  the_u class
Una universidad necesita registrar la inscripción de sus estudiantes. 
Cada inscripción relaciona un estudiante con una asignatura. 
Del estudiante se conoce el nombre y el código.
De la asignatura se conoce el nombre y la cantidad de créditos.
El sistema debe mostrar toda la información de la inscripción.
*/
import java.util.Scanner;

public class the_u {
    String student_name = "";
    String student_code = "";
    String subject_name = "";
    int subject_credits = 0;
    Scanner sc = new Scanner(System.in);

    void showEnrollmentInfo() {
        System.out.println("Ingrese Nombre del estudiante: ");
        student_name = sc.nextLine();
        System.out.println("Ingrese Código del estudiante: ");
        student_code = sc.nextLine();
        System.out.println("Ingrese Nombre de la asignatura: ");
        subject_name = sc.nextLine();
        System.out.println("Ingrese Cantidad de créditos de la asignatura: ");
        subject_credits = sc.nextInt();
    }

    void displayEnrollmentDetails() {
        System.out.println("Detalles de la Inscripción:");
        System.out.println("Nombre del estudiante: " + student_name);
        System.out.println("Código del estudiante: " + student_code);
        System.out.println("Nombre de la asignatura: " + subject_name);
        System.out.println("Cantidad de créditos de la asignatura: " + subject_credits);
    }

    public static void main(String[] args) {
        the_u university = new the_u();
        university.showEnrollmentInfo();
        university.displayEnrollmentDetails();
    }
}

import java.util.Scanner;

public class school {
    String name;
    byte age;
    byte grade;

    void showinfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        school school = new school();

        System.out.println("Ingrese el nombre del estudiante ");
        school.name = sc.nextLine();

        System.out.println("Ingrese la edad del estudiante: ");
        school.age = sc.nextByte();

        System.out.println("Ingrese la calificación del estudiante: ");
        school.grade = sc.nextByte();

        school.showinfo();
    }
}

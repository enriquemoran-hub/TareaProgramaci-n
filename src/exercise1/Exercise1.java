package exercise1;

import javax.swing.*;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu nombre: ");
        String name = sc.next();

        System.out.println("introduce tu apellido: ");
        String surname = sc.next();

        System.out.println("introduce tu edad: ");
        int age = sc.nextInt();

        System.out.println("Tu nombre es: " + name + " tu apellido es: " + surname + " tu edad es: " + age);
        JOptionPane.showMessageDialog(null,
                "Tu nombre es: " + name + " tu apellido es: " + surname + " tu edad es: " + age);


    }
}

package exercise5;

import javax.swing.*;
import java.util.Scanner;

public class Exercise5 {
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] adminOptions = {"administrador", "consulta", "salir"};
        String[] viewOptions = {"consola", "diálogo"};

        Exercise5 exercise5 = new Exercise5();
        Person[] people = null;

        boolean isExit = false;
        boolean showInDialog = false;

        int viewOption = JOptionPane.showOptionDialog(null, "¿Quieres que el programa funcione por consola o vetana de dialogo?",
                "Elige una opción",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, viewOptions, viewOptions[0]);
        switch (viewOption) {
            case 0: {
                showInDialog = false;
                break;
            }
            case 1: {
                showInDialog = true;
                break;
            }
            default:
                System.out.println("Hubo un error fatal");
        }
        while (!isExit) {
            int adminOption = JOptionPane.showOptionDialog(null, "¿Eres administrador o quieres consultar un alumno?",
                    "Elige una opción",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, adminOptions, adminOptions[0]);

            switch (adminOption) {
                case 0: {
                    people = new Person[exercise5.getNumberFromKeyboard(showInDialog)];
                    exercise5.addPeople(people, showInDialog);
                    break;
                }
                case 1: {
                    exercise5.userAction(people, showInDialog);
                    break;
                }
                case 2: {
                    isExit = true;
                    break;
                }
                default:
                    System.out.println("Hubo un error fatal");
            }
        }


    }

    private void showMessage(String message, boolean showInDialog) {
        if (showInDialog) {
            JOptionPane.showMessageDialog(null,
                    message);
        } else {
            System.out.println(message);
        }
    }

    private void userAction(Person[] people, boolean showInDialog) {
        if (people == null) {
            showMessage("El administrador no ha registrado ninguna persona", showInDialog);
        } else {
            Person person = new Person();
            showMessage("Introduce el nombre de la persona que quieres comprobar si ha asistido a la fiesta", showInDialog);
            person.setName(getStringsFromKeyboard(showInDialog));
            showMessage("Introduce el apellido de la persona que quieres comprobar si ha asistido a la fiesta", showInDialog);
            person.setSurname(getStringsFromKeyboard(showInDialog));

            for (Person currentPerson : people) {
                if (currentPerson.getName().equalsIgnoreCase(person.getName()) &&
                        currentPerson.getSurname().equalsIgnoreCase(person.getSurname())) {
                    if (currentPerson.isRegistered() == 1) {
                        showMessage(currentPerson.getName() + " ha asistido a la fiesta", showInDialog);
                    } else if (currentPerson.isRegistered() == 0) {
                        showMessage(currentPerson.getName() + " no ha asistido a la fiesta", showInDialog);
                    }
                }
            }
        }
    }

    private void addPeople(Person[] people, boolean showInDialog) {
        Person person = new Person();
        for (int i = 0; i < people.length; i++) {
            showMessage("Introduce el nombre de la persona", showInDialog);
            person.setName(getStringsFromKeyboard(showInDialog));
            showMessage("Introduce el apellido de la persona", showInDialog);
            person.setSurname(getStringsFromKeyboard(showInDialog));
            showMessage("¿ha asistido a la fiesta " + person.getName() + " ?, si es así introduce 1, sino introduce 0", showInDialog);
            person.setRegistered(getNumberFromKeyboard(showInDialog));
            people[i] = person;
            person = new Person();
        }
    }

    private int getNumberFromKeyboard(boolean showInDialog) {
        if(showInDialog){
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de alumnos que quieres añadir"));
            } catch (Exception e) {
                return 0;
            }
        }
        else{
            return sc.nextInt();
        }
    }

    private String getStringsFromKeyboard(boolean showInDialog){
        if(showInDialog){
            return JOptionPane.showInputDialog(null, "Introduce el texto");
        }
        else{
            return sc.next();
        }
    }

}

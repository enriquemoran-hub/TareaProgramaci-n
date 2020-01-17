package exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Declaramos un array con 10 posiciones vacías
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        // Declaramos los 3 contadores uno para cada caso que se pide en el ejercicio
        int multipleOf3Counter = 0;
        int multipleOf5Counter = 0;
        int restOfNumbersCounter = 0;

        // Añadimos los números introducidos por teclado a nuestro array uno a uno
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número");
            numbers[i] = sc.nextInt();
        }

        // Como no necesitamos usar índices utilizamos un for each para actualizar los contadores en cada uno de los casos que s epresenten
        for (int number : numbers) {
            if(number % 3 == 0){
                multipleOf3Counter++;
            }
            else if(number % 5 == 0){
                multipleOf5Counter++;
            }
            else {
                restOfNumbersCounter++;
            }
        }

        // Finalmente imprimimos el resultado de los 3 contadores

        System.out.println("Hay " + multipleOf3Counter + " múltiplos de 3");
        System.out.println("Hay " + multipleOf5Counter + " múltiplos de 5");
        System.out.println("Hay " + restOfNumbersCounter + " que no son múltiplos ni de 3 ni de 5");

    }
}

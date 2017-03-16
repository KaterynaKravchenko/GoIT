package Scanner;

import java.util.Scanner;

// Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number:");
        int numberOne = scan.nextInt();
        System.out.println("Input the second number:");
        int numberTwo = scan.nextInt();

        if (numberOne > numberTwo) {
            int minus = numberOne - numberTwo;
            System.out.println(minus);
        }
        else if (numberOne < numberTwo) {
            int plus = numberOne + numberTwo;
            System.out.println(plus);
        }
        else {
            System.out.println("The numbers are the same");
        }
    }
}

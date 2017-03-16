package Scanner;

import java.util.Scanner;

// Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

public class DiapasonePlus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number:");
        int numberOne = scan.nextInt();
        System.out.println("Input the second number:");
        int numberTwo = scan.nextInt();
        int sumOfNumbers = numberOne + numberTwo;

        if (sumOfNumbers >= 11 &&  sumOfNumbers <= 19)  {
            System.out.println("The result is: " + sumOfNumbers);
        }
        else {
            System.out.println("The sum of numbers " + sumOfNumbers + " aren't in diapasone 11 - 19.");
        }
    }
}

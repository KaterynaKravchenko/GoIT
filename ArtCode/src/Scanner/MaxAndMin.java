package Scanner;

import java.util.Scanner;

// Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNum = scan.nextInt();
        System.out.println("Input second number:");
        int secondNum = scan.nextInt();
        System.out.println("Input third number:");
        int thirdNum = scan.nextInt();
        if (firstNum > secondNum && firstNum > thirdNum){
            System.out.println("The larger number is " + firstNum);
        }
        else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println("The larger number is " + secondNum);
        }
        else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.println("The larger number is " + thirdNum);
        }
        if (firstNum < secondNum && firstNum < thirdNum){
            System.out.println("The smaller number is " + firstNum);
        }
        else if (secondNum < firstNum && secondNum < thirdNum) {
            System.out.println("The smaller number is " + secondNum);
        }
        else if (thirdNum < firstNum && thirdNum < secondNum) {
            System.out.println("The smaller number is " + thirdNum);
        }
    }
}

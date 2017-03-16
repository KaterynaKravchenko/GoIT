package Scanner;

import java.util.Scanner;

// Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
//  124     4    -   true
//  1456    567  -   false
//  1       2    -   false
//  18      98   -   true

public class LastNumberRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number:");
        int frstNum = scan.nextInt();
        System.out.println("Input the second number:");
        int secNum = scan.nextInt();
        int ostFrstNum = frstNum % 10;
        int ostSecNum = secNum % 10;
        if (ostFrstNum == ostSecNum) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

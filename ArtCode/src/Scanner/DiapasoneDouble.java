package Scanner;

import java.util.Scanner;

// Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

public class DiapasoneDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number:");
        double number = scan.nextDouble();

        if (number >= 0 && number <= 1) {
            System.out.println("True");
        }
        else {
            System.out.println("The number dosen't in diapasone 0-1");
        }
    }
}

package Scanner;

import java.util.Scanner;

// Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

public class IntegerBySeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number:");
        int number = scan.nextInt();
        int ostNumber = number % 7;

        if ( ostNumber == 0 ) {
            System.out.println(number * number);
        }
        else {
            System.out.println("Impossible to divide your number " + number + "by 7 without residue");
        }
    }
}

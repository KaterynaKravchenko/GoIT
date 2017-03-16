package Scanner;

import java.util.Scanner;

// Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру
// и показываем результат деления (целую часть от деления  и остачу)
// в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

public class TrueOrFalse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number:");
        int numberOne = scan.nextInt();
        System.out.println("Input the second number:");
        int numberTwo = scan.nextInt();

        int ostNumber = numberOne % numberTwo;
        if ( ostNumber == 0 ) {
            int divNumber = numberOne / numberTwo;
            System.out.println("This is true " + divNumber);
        }
        else {
            System.out.println("False ho-ho-ho!\n The result is:" + numberOne / numberTwo + " and " + numberOne % numberTwo);
        }
    }
}

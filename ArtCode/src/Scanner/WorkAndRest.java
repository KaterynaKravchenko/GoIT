package Scanner;

import java.util.Scanner;

// Пользователь вводит параметр с консоли (текущий час от 0 до 24)
// Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

public class WorkAndRest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input time:");
        int time = scan.nextInt();

        if (time >= 19 && time <=8){
            System.out.println("I am working now!");
        }
        else {
            System.out.println("I am at home!");
        }
    }
}

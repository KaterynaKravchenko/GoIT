package Method;

import java.util.Scanner;

public class MyMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of pass");
        int size = in.nextInt();

        System.out.println("Input range");
        int range = in.nextInt();

        int[] mas = ArrayHelper.generateMasEvenNum(size,range);

        ArrayHelper.printArr(mas);

        System.out.println("________");

        String res = ArrayHelper.convert(mas);
        System.out.println(res);
    }
}

class ArrayHelper {
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateMasEvenNum(int size, int range){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            double number = Math.random();
            int masRandom = (int) (number * range);

           if((masRandom % 2) == 0) {
               mas[i] = masRandom;
           } else {
               mas[i] = masRandom + 1;
           }
            // можно заменить следующим кодом
           /* mas[i] = masRandom % 2 == 0 ? masRandom : masRandom + 1;*/
        }
        return mas; // end method
    }

    public static String convert(int[] mas){
        String res = "";// пустая строка
        for (int i = 0; i < mas.length; i++) {
            res = res + mas[i] + " ";
        }
        return res;
    }
}

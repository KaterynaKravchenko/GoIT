package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*User enter the size of array. Need even numbers of array put on even index of array, and conversely.
 */
public class _4_5_EvenOddNumbers {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = in.nextInt();

        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random()*100);
            if (i % 2 == 0) {
                if (mas[i] % 2 != 0) {
                    int y = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = y;
                }
            } else {
                if (mas[i] % 2 == 0) {
                    int x = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = x;
                }
            }



        }
        System.out.println(Arrays.toString(mas));
    }
}

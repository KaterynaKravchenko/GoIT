package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Find the average of array.
 */
public class _4_6_AverageArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = in.nextInt();

        System.out.println("Input range");
        int range = in.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        System.out.println(Arrays.toString(mas));

        for (int i = 1; i < mas.length ; i++) {
            mas[i] += mas[i-1];
        }
        int sum = mas[mas.length-1];
        double average = sum / size;
        System.out.println("The average of array is " + average);
    }

}

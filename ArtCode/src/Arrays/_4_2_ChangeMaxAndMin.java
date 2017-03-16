package Arrays;

import java.util.Scanner;

/*change max and min values on array.
 */
public class _4_2_ChangeMaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = in.nextInt();

        System.out.println("Input range");
        int range = in.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);

        int max = mas[0];
        int min = mas[0];
        int maxValue = 0;
        int minValue = 0;
        for (int i = 1; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
                i = maxValue;
            }
            if (min > mas[i]) {
                min = mas[i];
                i = minValue;
            }
        }
        int tmp = mas[maxValue];
        mas[maxValue] = mas[minValue];
        mas[minValue] = tmp;


    }
}

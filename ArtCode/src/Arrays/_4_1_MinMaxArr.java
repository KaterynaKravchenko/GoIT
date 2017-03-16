package Arrays;

import java.util.Scanner;

/*Find min and max value on array and print it.
 */
public class _4_1_MinMaxArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = in.nextInt();

        System.out.println("Input range");
        int range = in.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);

        ArrayUtils.printArr(mas);

// find index of max & min values
        int[] arrIndex = ArrayUtils.findIndexMaxAndMin(mas);
        System.out.println(" Max value of array - " + arrIndex[0] + "\n Min value of array - " + arrIndex[1]);

// find max & min values in array
        int max = mas[0];
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
            if (min > mas[i]) {
                min = mas[i];
            }
        }
        System.out.println("\n Another method:\n Max value of array - " + max + "\n Min value of array - " + min);
/* method for this way -> int[] arrOfMinAndMax = ArrayUtils.willFindMaxAndMin(mas); Max/Min value - arrOfMinAndMax[0/1];
        public static int[] willFindMaxAndMin(int[] mas){
        int max = mas[0];
        int min = mas[0];
        int[] arr = {min, max};
          for (int i = 1; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
            if (min > mas[i]) {
                min = mas[i];
            }
         }
         return arr;
        }*/

    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*We have two arrays. Create and print the third array where the elements is arr1[i]+arr2[i]
 */
public class _4_8_ThirdArrayOfSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int size = in.nextInt();

        System.out.println("Enter the range of arrays");
        int range = in.nextInt();

        int[] arr1 = ArrayUtils.generateMas(size, range);
        System.out.println("The first array " + Arrays.toString(arr1));

        int[] arr2 = ArrayUtils.generateMas(size, range);
        System.out.println("The second array " + Arrays.toString(arr2));

        int[] mas = new int[size];
        for (int i = 0; i < size ; i++) {
            mas[i] = arr1[i] + arr2[i];
        }
        System.out.println();
        System.out.println("The array of summed elements " + Arrays.toString(mas));
    }
}

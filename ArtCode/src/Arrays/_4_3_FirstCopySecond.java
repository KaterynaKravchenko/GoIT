package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*We have two arrays any size and any values (int). Swap the elements of this arrays.
 */
public class _4_3_FirstCopySecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int size = in.nextInt();

        System.out.println("Enter the range of arrays");
        int range = in.nextInt();

        int[] arr1 = ArrayUtils.generateMas(size, range);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = ArrayUtils.generateMas(size, range);
        System.out.println(Arrays.toString(arr2));

        int[] swapArr1 = ArrayUtils.swapArr(arr2, size);
        int[] swapArr2 = ArrayUtils.swapArr(arr1, size);

        System.out.println("Now we swap the elements. And here you arrays:");
        System.out.println(Arrays.toString(swapArr1));
        System.out.println(Arrays.toString(swapArr2));
    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*public static int[] splitArray(int[] arr, int start, int end) { // cut the array on the boundaries start & end
	}
 */
public class _4_10_CutTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = in.nextInt();

        System.out.println("Input range");
        int range = in.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        System.out.println(Arrays.toString(mas));

        System.out.println("Input index of start");
        int start = in.nextInt();
        System.out.println("Input index of end");
        int end = in.nextInt();

        // check of correct values start & end
        while(start > end || end > (size - 1) || (end - start) == 0){
            System.out.println("Incorrect values start & end");
            System.out.println("Input index of start");
            start = in.nextInt();
            System.out.println("Input index of end");
            end = in.nextInt();
        }

        int[] arr = ArrayUtils.splitArray(mas, start, end);
        System.out.println(Arrays.toString(arr));
    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Ask the user about number and found how many this number we have in the array.
 */
public class _4_4_HowManyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = in.nextInt();

        System.out.println("Input range");
        int range = in.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        System.out.println(Arrays.toString(mas));

        System.out.println("Input the number which need to find:");
        int number = in.nextInt();

        int calcul = ArrayUtils.howManyNumbersHere(mas, number);
        System.out.println(calcul);
    }
}

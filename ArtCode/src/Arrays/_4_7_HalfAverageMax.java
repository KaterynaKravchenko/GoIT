package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class _4_7_HalfAverageMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = in.nextInt();
        while (size % 2 != 0) {
            System.out.println("Please, enter the even size of array");
            size = in.nextInt();
        }
        System.out.println("Input range");
        int range = in.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        System.out.println(Arrays.toString(mas));

        int[] sum = ArrayUtils.sumOfHalfArr(mas);

        System.out.println("Check the sum - " + Arrays.toString(sum));

        int[] biggestHalf = ArrayUtils.biggestHalfArr(mas, sum);
        System.out.println("The biggest half of array is - " + Arrays.toString(biggestHalf));
    }
}

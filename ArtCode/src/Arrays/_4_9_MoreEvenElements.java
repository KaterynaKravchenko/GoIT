package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/* Create two arrays with random numbers in diapason from 25 to 75.
 Find in which array more even numbers and print this array.
 */
public class _4_9_MoreEvenElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of arrays");
        int size = in.nextInt();

        int[] mas = ArrayUtils.generateMasWithBorder(size);
        System.out.println(Arrays.toString(mas));

        int[] arr = ArrayUtils.generateMasWithBorder(size);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int evenNumMas = ArrayUtils.evenNumbers(mas);// will find the even numbers in array mas[];

        int evenNumArr = ArrayUtils.evenNumbers(arr); // will find the even numbers in array arr[];

        if(evenNumArr < evenNumMas){
            System.out.println("More even numbers in array " + Arrays.toString(mas));
        } else {
            if (evenNumArr > evenNumMas) {
                System.out.println("More even numbers in array " + Arrays.toString(arr));
            } else {
                System.out.println("This arrays have the same even numbers");
            }
        }
    }
}

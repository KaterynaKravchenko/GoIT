package Codingbat;

import java.util.Arrays;
import java.util.Scanner;

/*Given an array of ints, return true if the array contains no 1's and no 3's.
lucky13({0, 2, 4}) → true
lucky13({1, 2, 3}) → false
lucky13({1, 2, 4}) → false
 */
public class Lucky13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = in.nextInt();
        System.out.println("Input range");
        int range = in.nextInt();

        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * range);
        }
        System.out.println(Arrays.toString(mas));

        boolean result = true;
        for(int i = 0; i < mas.length; i++){
            if(mas[i] == 1 || mas[i] == 3){
                result = false;
            }
        }
        System.out.println(result);
    }
}


package Codingbat;

import java.util.Scanner;

/*Given an array of ints, return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.
firstLast6 {1, 2, 6}  true
firstLast6 {6, 1, 2, 3}  true
firstLast6 {13, 6, 1, 2, 3}  false
*/
public class FirstLast6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of masive");
        int sizeMas = in.nextInt();

        System.out.println("Input range");
        int rangeMas = in.nextInt();

        int[] mas = ArrayNew.generateMas(sizeMas,rangeMas);
        ArrayNew.printArr(mas);

        boolean result = ArrayNew.youHaveSix(mas);
        System.out.println(result);
    }

}
class ArrayNew {
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] generateMas(int sizeMas, int rangeMas){
        int[] mas = new int[sizeMas];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * rangeMas);
        }
        return mas; // end method
    }
    public static boolean youHaveSix(int[] mas){
        boolean result = true;
        for(int i = 0; i < mas.length; i++){
            if (mas[0] == 6 || mas[mas.length-1] == 6) {
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }
}
  /* My code on http://codingbat.com/

  public boolean firstLast6(int[] nums) {
        boolean result = true;
        for(int i = 0; i < nums.length; i++){
            if (nums[0] == 6 || nums[nums.length-1] == 6) {
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }*/
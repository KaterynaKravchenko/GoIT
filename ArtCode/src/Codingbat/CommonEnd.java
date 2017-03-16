package Codingbat;

import java.util.Scanner;

/*
 Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
        commonEnd({1, 2, 3}, {7, 3}) → true
        commonEnd({1, 2, 3}, {7, 3, 2}) → false
        commonEnd({1, 2, 3}, {1, 3}) → true
 */
public class CommonEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of first masive");
        int sizeMasOne = in.nextInt();
        System.out.println("Input range of first masive");
        int rangeMasOne = in.nextInt();

        System.out.println("Input size of second masive");
        int sizeMasTwo = in.nextInt();
        System.out.println("Input range of second masive");
        int rangeMasTwo = in.nextInt();

        int[] masOne = TwoMasCheck.generateMasOne(sizeMasOne,rangeMasOne);
        TwoMasCheck.printArr(masOne);

        int[] masTwo = TwoMasCheck.generateMasTwo(sizeMasTwo,rangeMasTwo);
        TwoMasCheck.printArr(masTwo);

        boolean result = TwoMasCheck.sameFirstLastEl(masOne, masTwo);
        System.out.println(result);
    }
}
class TwoMasCheck {
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] generateMasOne(int sizeMasOne, int rangeMasOne){
        int[] masOne = new int[sizeMasOne];
        for (int i = 0; i < masOne.length; i++) {
            masOne[i] = (int)(Math.random() * rangeMasOne);
        }
        return masOne; // end method
    }
    public static int[] generateMasTwo(int sizeMasTwo, int rangeMasTwo){
        int[] masTwo = new int[sizeMasTwo];
        for (int i = 0; i < masTwo.length; i++) {
            masTwo[i] = (int)(Math.random() * rangeMasTwo);
        }
        return masTwo; // end method
    }

    public static boolean sameFirstLastEl(int[] masOne, int[] masTwo){
        boolean result = true;
        for(int i = 0; (i < masOne.length || i < masTwo.length); i++){
            if (masOne[0] == masTwo[0] || masOne[masOne.length-1] == masTwo[masTwo.length-1]) {
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }
}

   /* My code on http://codingbat.com/

   public boolean commonEnd(int[] a, int[] b) {
        boolean result = true;
        for(int i = 0; (i < a.length || i < b.length); i++){
            if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }*/




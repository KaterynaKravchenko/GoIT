package Codingbat;

import java.util.Scanner;

/*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.
makeMiddle({1, 2, 3, 4}) → {2, 3}
makeMiddle({7, 1, 2, 3, 4, 9}) → {2, 3}
makeMiddle({1, 2}) → {1, 2}
 */
public class MakeMiddle {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4};
        int[] newMas = new int[2];
        int x = mas.length/2; // we are at the middle of the massive: 6 -> 3; 10 -> 5.

        newMas[0] = mas[x-1]; // we need first index of the middle
        newMas[1] = mas[x];
        for (int i = 0; i < newMas.length ; i++) {
            System.out.print(newMas[i] + " ");
        }
    }
}
/* My code on http://codingbat.com/
public int[] makeMiddle(int[] nums) {
  int[] newMas = new int[2];
  int x = nums.length / 2;

  newMas[0] = nums[x-1];
  newMas[1] = nums[x];

  return newMas;
}*/


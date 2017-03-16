package Codingbat;

/*Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3.

midThree({1, 2, 3, 4, 5}) → {2, 3, 4}
midThree({8, 6, 7, 5, 3, 0, 9}) → {7, 5, 3}
midThree({1, 2, 3}) → {1, 2, 3}
 */
public class MidThree {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5, 6, 7};
        int[] newMas = new int[3];
        int x = mas.length/2; // we are at the middle of the massive: 5 -> 2; 7 -> 3.

        newMas[0] = mas[x-1]; // we need first index of the middle
        newMas[1] = mas[x];
        newMas[2] = mas[x+1];
        for (int i = 0; i < newMas.length ; i++) {
            System.out.print(newMas[i] + " ");
        }
    }
}
/* My code on http://codingbat.com/
    public int[] midThree(int[] nums) {
        int[] newMas = new int[3];
        int x = nums.length/2;

        newMas[0] = nums[x-1];
        newMas[1] = nums[x];
        newMas[2] = nums[x+1];

        return newMas;
    }*/


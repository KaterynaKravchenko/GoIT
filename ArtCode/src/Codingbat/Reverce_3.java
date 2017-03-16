package Codingbat;

/*Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
reverse3({1, 2, 3}) → {3, 2, 1}
reverse3({5, 11, 9}) → {9, 11, 5}
reverse3({7, 0, 0}) → {0, 0, 7}
 */
public class Reverce_3 {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3};

        for(int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("");

        int x = 0;
        x = mas[2]; // x = 3
        mas[2] = mas[0]; // 1 -> 3
        mas[0] = x; // 3 -> 1
        /* I can create new massive, but in big project it could be to expensive for memory.
        int[] newMas = {0, 0, 0};
        newMas[0] = mas[2];
        newMas[2] = mas[0];
        newMas[1] = mas[1];*/
        for(int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}

    /* My code on http://codingbat.com/

    public int[] reverse3(int[] nums) {
        int x = 0;
        x = nums[2];
        nums[2] = nums[0];
        nums[0] = x;

        return nums;
    }
*/

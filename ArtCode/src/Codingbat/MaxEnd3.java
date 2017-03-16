package Codingbat;

/*Given an array of ints length 3, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. Return the changed array.
maxEnd3({1, 2, 3}) → {3, 3, 3}
maxEnd3({11, 5, 9}) → {11, 11, 11}
maxEnd3({2, 11, 3}) → {3, 3, 3}
 */
public class MaxEnd3 {
    public static void main(String[] args) {
        int[] mas = {11, 5, 9};
        int[] masNew = {0, 0, 0};
        if(mas[0] > mas[mas.length-1]){
            masNew[0] = mas[0];
            masNew[1] = mas[0];
            masNew[2] = mas[0];
        } else {
            masNew[0] = mas[mas.length-1];
            masNew[1] = mas[mas.length-1];
            masNew[2] = mas[mas.length-1];
        }
        for (int i = 0; i < masNew.length; i++) {
            System.out.print(masNew[i] + " ");
        }

    }
}
/* My code on http://codingbat.com/
    public int[] maxEnd3(int[] nums) {
        int[] maxNums = new int[3];
        if(nums[0] > nums[nums.length - 1]){
            maxNums[0] = nums[0];
            maxNums[1] = nums[0];
            maxNums[2] = nums[0];
        } else {
            maxNums[0] = nums[nums.length - 1];
            maxNums[1] = nums[nums.length - 1];
            maxNums[2] = nums[nums.length - 1];

        }

        return maxNums;
    }*/
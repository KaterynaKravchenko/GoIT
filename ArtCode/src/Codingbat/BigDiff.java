package Codingbat;

/*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff({10, 3, 5, 6}) → 7
bigDiff({7, 2, 10, 9}) → 8
bigDiff({2, 10, 7, 2}) → 8
 */
public class BigDiff {
    public static void main(String[] args) {
        int[] nums = {2, 10};
        int minVal = nums[0];
        int maxVal = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if(minVal > nums[i+1]){
                minVal = Math.min(nums[i], nums[i+1]);
            }
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(maxVal < nums[i+1]) {
                maxVal = Math.max(nums[i], nums[i+1]);
            }
        }
        System.out.println(maxVal - minVal);
    }
}


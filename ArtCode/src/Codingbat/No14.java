package Codingbat;

import java.util.Arrays;

/*Given an array of ints, return true if it contains no 1's or it contains no 4's.
no14({1, 2, 3}) → true
no14({1, 2, 3, 4}) → false
no14({2, 3, 4}) → true
 */
public class No14 {
    public static void main(String[] args) {
        boolean result = true;
        int[] nums = {1, 2, 3, 4};

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] == 4){
                        result = false;
                    }
                }
            }
            if(nums[i] == 4){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] == 1){
                        result = false;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(result);
    }
}

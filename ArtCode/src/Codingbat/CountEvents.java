package Codingbat;

/*Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens({2, 1, 2, 3, 4}) → 3
countEvens({2, 2, 0}) → 3
countEvens({1, 3, 5}) → 0
 */
public class CountEvents {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 4};
        int evenNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                evenNum++;
            }
        }
        System.out.println(evenNum);
    }
}
    /*public int countEvens(int[] nums) {
        int evenNum = 0;
        for( int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evenNum++;
            }
        }
        return evenNum;
    }*/

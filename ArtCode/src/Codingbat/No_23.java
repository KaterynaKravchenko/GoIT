package Codingbat;

/*Given an int array length 2, return true if it does not contain a 2 or 3.
no23({4, 5}) → true
no23({4, 2}) → false
no23({3, 5}) → false
 */
public class No_23 {
    public static void main(String[] args) {
        int[] no23 = {2, 5};
        for(int i = 0; i < no23.length; i++) {
            System.out.print(no23[i] + " ");
        }
        System.out.println("");
        boolean result = true;
        if (no23[0] == 2 || no23[1] == 2 || no23[0] == 3 || no23[1] == 3) {
            result = false;
        } else {
            result = true;
        }
        System.out.println(result);
    }
}
   /* My code on http://codingbat.com/
    public boolean no23(int[] nums) {
        boolean result = true;
        if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
*/
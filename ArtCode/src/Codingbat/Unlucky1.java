package Codingbat;

/*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
unlucky1({1, 3, 4, 5}) → true
unlucky1({2, 1, 3, 4, 5}) → true
unlucky1({1, 1, 1}) → false
 */
public class Unlucky1 {
    public static void main(String[] args) {
        int[] mas = {1};
        boolean result = false;
        if(mas.length == 1) {
            System.out.print(mas[0]);
            result = false;
        } else {
            for (int i = 0; i < mas.length; i++) {
                if (mas[0] == 1 && mas[1] == 3) {
                    result = true;
                }
                if (mas[1] == 1 && mas[2] == 3) {
                    result = true;
                }
                if (mas[mas.length - 2] == 1 && mas[mas.length - 1] == 3) {
                    result = true;
                }
                System.out.print(mas[i] + " ");
            }
        }

        System.out.println("");
        System.out.println(result);
    }
}
/* My code on http://codingbat.com/
    public boolean unlucky1(int[] nums) {
  boolean result = false;
   if(nums.length == 1){
     result = false;
   } else {
          for (int i = 0; i < nums.length; i++) {
            if(nums[0] == 1 && nums[1] == 3){
                result = true;
            }
            if(nums[1] == 1 && nums[2] == 3){
                result = true;
            }
            if(nums[nums.length - 2] == 1 && nums[nums.length-1] == 3){
                result = true;
            }

           }
    }
 return result;
}*/

package Codingbat;

/*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
sameFirstLast({1, 2, 3}) → false
sameFirstLast({1, 2, 3, 1}) → true
sameFirstLast({1, 2, 1}) → true
 */
public class SameFirstLast {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        boolean result = false;
        if(mas[0] == mas[mas.length-1]){
            result = true;
        }
        System.out.println("");
        System.out.println(result);
    }
}

/* My code on http://codingbat.com/
    public boolean sameFirstLast(int[] nums) {
  boolean result = false;
   if(nums.length >= 1){
   if(nums[0] == nums[nums.length - 1]){
    result = true;
   }
  }
  return result;
}*/
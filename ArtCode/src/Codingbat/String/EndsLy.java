package Codingbat.String;

import java.util.Scanner;

/*Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
public class EndsLy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = in.next();
        boolean result = true;

        int found = word.lastIndexOf('l', 1);// error((
        if(found == word.length() - 1){
            result = true;
            System.out.println(result);
        } else {
            result = false;
            System.out.println(result);
        }

    }
}

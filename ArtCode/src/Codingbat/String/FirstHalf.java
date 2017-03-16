package Codingbat.String;

/*
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
public class FirstHalf {
    public static void main(String[] args) {
        String str = "WooHoo";
        String halfStr = str.substring(0, str.length() / 2); //Given a string of even length, return the first half.
        System.out.println(halfStr);

        String midStr = str.substring(1, str.length()-1);//Given a string, return a version without the first and last char, so "Hello" yields "ell".
        System.out.println(midStr);

        String firstStr = "Hello"; //Return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
        String secondStr = "Rainbow"; //The strings will not be the same length, but they may be empty (length 0).
        if(firstStr.length() < secondStr.length()){
            System.out.println(firstStr + secondStr + firstStr);
        } else {
            System.out.println(secondStr + firstStr + secondStr);
        }

    }
}

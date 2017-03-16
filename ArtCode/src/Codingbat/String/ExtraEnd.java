package Codingbat.String;

/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */
public class ExtraEnd {
    public static void main(String[] args) {
        String word = "ab";
        System.out.println(word.substring(word.length()-2) + word.substring(word.length()-2) + word.substring(word.length()-2));
    }
}
    /*public String extraEnd(String str) {
        String extra = str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
        return extra;
    }*/
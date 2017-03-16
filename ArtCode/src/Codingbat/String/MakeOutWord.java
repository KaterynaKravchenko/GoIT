package Codingbat.String;

/*Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g.
 "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */
public class MakeOutWord {
    public static void main(String[] args) {
        String out = "<<>>";
        String word = "WooHoo";

        /*String begin = out.substring(0,2);
        String end = out.substring(2,4);*/
        System.out.println(out.substring(0,2) + word + out.substring(2,4));
    }
}
   /* public String makeOutWord(String out, String word) {
        String outWord = out.substring(0, 2) + word + out.substring(2, 4);
        return outWord;
    }*/

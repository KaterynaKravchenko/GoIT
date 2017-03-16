package Codingbat.String;

/*Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */
public class TheEnd {
    public static void main(String[] args) {
        String str = "Hello";
        boolean front = false;
        if(front == true){
            System.out.println(str.substring(0, 1));
        } else {
            System.out.println(str.substring(str.length() - 1));
        }
    }
}

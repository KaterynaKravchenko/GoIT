package All;

public class AboutString {
    public static void main(String[] args) {
        String s1 = new String("new");
        String s2 = "vakues";

        String s3 = 34 + "";

        String s4 = String.valueOf(33);
        String s5 = String.valueOf(32.22);
        String s6 = String.valueOf(true);

        String src = "name = Oleg, age 30, salary 4000.00, strong true";

        char[] chars = src.toCharArray();

        char firstLetter = src.charAt(0);

        String a1 = new String("Andrey");
        String a2 = "Andrey";
        System.out.println( a1 == a2);
        System.out.println(a1.equals(a2));

        int codePoint = src.codePointAt(0);
        System.out.println("codepoint of 'n' is " + codePoint);

        boolean contains = "abcd".contains("bc");
        System.out.println("abcd".equalsIgnoreCase("ABCD"));

        System.out.println("ababbbbdddc".startsWith("ab"));
        System.out.println("ababbbbdddc".endsWith("dc"));

        String json = "{name:Oleg,age:30}";
        int start = json.indexOf("Oleg");
        int end = json.indexOf(",");

        String part = json.substring(start,end);
        System.out.println(part);

        int aLastIndex = json.lastIndexOf("a");

        int symbolsSize = json.length();

        String lowerCace = "ABC".toLowerCase();
        String upperCase = "abcd".toUpperCase();

        String replace = json.replace(",", "|");
        System.out.println(replace);

        String res = "         one two tree four five        ".trim();
        System.out.println(res);

        // String[] res =


    }
}

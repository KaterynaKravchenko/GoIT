package Codingbat;

/*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
middleWay({1, 2, 3}, {4, 5, 6}) → {2, 5}
middleWay({7, 7, 7}, {3, 8, 0}) → {7, 8}
middleWay({5, 2, 9}, {1, 4, 5}) → {2, 4}
 */
public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");

        int[] b = {4, 5, 6};
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("");

        int[] c = new int[2];

        c[0] = a[1];
        c[1] = b[1];

        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("");
    }
}

    /*My code on http://codingbat.com/

    public int[] middleWay(int[] a, int[] b) {
        int[] c = new int[2];

        c[0] = a[1];
        c[1] = b[1];

        return c;
    }*/


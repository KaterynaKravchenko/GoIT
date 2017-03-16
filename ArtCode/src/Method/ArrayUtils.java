package Method;

public class ArrayUtils {
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateMas(int size, int range){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * range);
        }
        return mas; // end method
    }
}

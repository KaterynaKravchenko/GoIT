package Module2;

public class WorkWithArray {

    static int sum (int[] arr1){
        int result = 0;
          for(int i = 0; i < arr1.length; i++){
              result += arr1[i]; }
        return result;
    }
    static double sum (double[] arr2){
        double result = 0;
          for(double item: arr2){
              result += item; }
        return result;
    }
    static int min (int[] arr1){
        int result = arr1[0];
           for(int item: arr1){
              if(item < result) result = item;}
        return result;
    }
    static double min (double[] arr2){
        double result = arr2[0];
          for(double item: arr2){
              if(item < result) result = item;}
        return result;
    }
    static int max (int[] arr1){
        int result = arr1[0];
          for(int item: arr1){
              if(item > result) result = item;}
        return result;
    }
    static double max (double[] arr2){
        double result = arr2[0];
          for(double item: arr2){
              if(item > result) result = item;}
        return result;
    }
    static int maxPositive (int[] arr1){
        int result = 0;
          for(int item: arr1){
              if(item > 0){
                  if(item > result) result = item;}}
        return result;
    }
    static double maxPositive (double[] arr2){
        double result = 0;
        for(double item: arr2){
            if(item > 0){
                if(item > result) result = item;}}
        return result;
    }
    static int multiplication (int[] arr1){
        int result = 1;
          for(int item: arr1){
               result *= item;}
        return result;
    }
    static double multiplication (double[] arr2){
        double result = 1;
          for(double item: arr2){
              result *= item;}
        return result;
    }
    static int modulus (int[] arr1){
        return arr1[0]%arr1[9];
    }
    static double modulus (double[] arr2){
        return arr2[0]%arr2[9];
    }
    static int secondLargest (int[] arr1){
        int result = arr1[0];
          int max = max(arr1);
            for(int item: arr1){
                if (item < max && item > result) result = item;
            }
        return result;
    }
    static double secondLarge (double[] arr2){
        double result = arr2[0];
        double max = max(arr2);
        for(double item: arr2){
            if (item < max && item > result) result = item;
        }
        return result;
    }

    public static void main(String[] args) {
        // for int array
        int[] arr1 = {5, -8, 0, 22, -44, 17, 15, -6, -82, 89};
        System.out.print("Integer array {");
        for(int item: arr1){
            System.out.print(item + " ");
        }
        System.out.println("}");
        int sumInt = sum(arr1);
        System.out.println("The summ of array is " + sumInt);
        int minInt = min(arr1);
        System.out.println("The minimum of array is " + minInt);
        int maxInt = max(arr1);
        System.out.println("The maximum of array is " + maxInt);
        int maxPosInt = maxPositive(arr1);
        System.out.println("Max positive element of array is " + maxPosInt);
        int multInt = multiplication(arr1);
        System.out.println("The multiplication of array is " + multInt);
        int modInt = modulus(arr1);
        System.out.println("The modul first and last elements is " + modInt);
        int maxSecInt = secondLargest(arr1);
        System.out.println("Tha second largest element of array is " + maxSecInt);

        System.out.println("---------------------------------------");
        double[] arr2 = {0.158, 1.58, 57.2, 1.6945, -6.35, -8, 7.2, 15.68, -5.5, -12};
        System.out.print("Double array {");
        for(double item: arr2){
            System.out.print(item + " ");}
        System.out.println("}");
        double sumDouble = sum(arr2);
        System.out.println("The summ of array is " + sumDouble);
        double minDouble = min(arr2);
        System.out.println("The minimum of array is " + minDouble);
        double maxDouble = max(arr2);
        System.out.println("The maximum of array is " + maxDouble);
        double maxPosDouble = maxPositive(arr2);
        System.out.println("Max positive element of array is " + maxPosDouble);
        double multDouble = multiplication(arr2);
        System.out.println("The multiplication of array is " + multDouble);
        double modDouble = modulus(arr2);
        System.out.println("The modul first and last elements is " + modDouble);
        double maxSecDouble = secondLarge(arr2);
        System.out.println("Tha second largest element of array is " + maxSecDouble);

    }
}

package Arrays;

public class ArrayUtils {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateMas(int size, int range) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * range);
        }
        return mas; // end method
    }

    public static int[] generateMasWithBorder(int size){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            final int min = 25; // min border for diapason
            final int max = 75; // max border for diapason
            int random = ArrayUtils.random(min, max);
            mas[i] = random;
        }
       return mas;
    }

    public static int random(int min, int max) {
        max -= min; // получаем множитель псевдослучайного вещественного числа 75-25 = 50
        int random = (int) (Math.random() * ++max) + min; // инкрементируем 50 + 1, умножаем на рандомное число, и прибавляем нижнюю границу.
        return random;
    }

    public static int[] splitArray(int[] arr, int start, int end) {
        int[] newMas = new int[end - start + 1];
        for (int i = 0; i < newMas.length; i++) {
            newMas[i] = arr[start + i];
        }
        return newMas;
    }

    public static int[] swapArr(int[] arr, int size) {
        int[] swapArr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            swapArr[i] = arr[i];
        }
        return swapArr;
    }

    public static int[] sumOfHalfArr(int[] mas) {

        int firstSum = 0;
        for (int i = 0; i < mas.length / 2; i++) { // I find the average the first half of array
            firstSum += mas[i];
        }
        int secSum = 0;
        for (int i = mas.length / 2; i < mas.length; i++) { // I find the average the second half of array
            secSum += mas[i];
        }
        int[] sum = {firstSum, secSum};
        return sum;
    }

    public static int[] biggestHalfArr(int[] mas, int[] sum) {
        int size = mas.length / 2;
        int[] biggestHalf = new int[mas.length / 2];
        if (sum[0] > sum[1]) {
            for (int i = 0; i < size; i++) {
                biggestHalf[i] = mas[i];
            }
        }
        if (sum[0] < sum[1]) {
            for (int i = size; i < mas.length; i++) {
                biggestHalf[i - size] = mas[i];
            }
        }
        if (sum[0] == sum[1]) {
            for (int i = 0; i < mas.length; i++) {
                biggestHalf[i] = mas[i];
            }
        }
        return biggestHalf;
    }

    public static int[] findIndexMaxAndMin(int[] mas){
        int[] arrIndex = new int[2];
        int maxIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[maxIndex] < mas[i]) {
                maxIndex = i;
            }
        }
        int minIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[minIndex] > mas[i]) {
                minIndex = i;
            }
        }
        arrIndex[0] = mas[maxIndex];
        arrIndex[1] = mas[minIndex];
      return arrIndex;
    }

    public static int evenNumbers(int[] mas){
        int evenNum = 0;
        for( int i = 0; i < mas.length; i++){
            if(mas[i] % 2 == 0){
                evenNum++;
            }
        }
       return evenNum;
    }

    public static int howManyNumbersHere(int[] mas, int number){
        int calcul = 0;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == number){
                calcul++;
            }
        }
       return calcul;
    }
}

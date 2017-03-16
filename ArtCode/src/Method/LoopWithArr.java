package Method;


public class LoopWithArr {
    public static void main(String[] args) {
        int[] mas = {1,2,3};

        for(int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

        for( int i = mas.length - 1; i >= 0; i--){
            System.out.println(mas[i]);
        }
    }
}

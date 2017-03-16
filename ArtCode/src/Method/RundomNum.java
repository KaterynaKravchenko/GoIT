package Method;

public class RundomNum {
    public static void main(String[] args) {
       double pow = Math.pow(2,5);
        double random = Math.random();
        System.out.println(random);

        for(int i = 0; i < 10; i++){
            double random1 = Math.random();
            int run = (int)random * 15;
            System.out.println(random1);
            System.out.println(run);
        }
    }
}

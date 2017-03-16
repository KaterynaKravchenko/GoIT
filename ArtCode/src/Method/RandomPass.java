package Method;

import java.util.Scanner;

public class RandomPass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of pass");
        int size = in.nextInt();

        System.out.println("Input range");
        int range = in.nextInt();

        int[] mas = ArrayUtils.generateMas(size,range);

        Method.ArrayUtils.printArr(mas);

        System.out.println("Are you pleasured?");
        boolean isGoodPass = in.nextBoolean();
        if(isGoodPass){
            System.out.println("********");
            ArrayUtils.printArr(mas);
            System.out.println("********");
        } else {
            System.out.println("Repeat action");
            mas = ArrayUtils.generateMas(size,range);

            System.out.println("New pass");
            ArrayUtils.printArr(mas);
        }

    }
}

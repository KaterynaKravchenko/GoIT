package Method;

import java.util.Scanner;

public class WhyWeMethod {
    public static void main(String[] args) {
      inputNameAndSayHello();

    }

    public static void inputNameAndSayHello(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }

}

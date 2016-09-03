package Module3.Mathematic;

public class Main {
    public static void main(String[] args) {
        Integer a = 50, b = 100;

        Adder adder1 = new Adder();
        System.out.println("The summ is: " + adder1.add(a, b));
        System.out.println("Is a is bigger than b: " + adder1.check(a, b));

    }
}

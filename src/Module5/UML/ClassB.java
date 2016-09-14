package Module5.UML;

public class ClassB {
    private String x;
    private ClassA classA; //aggregation

    void test(){
        System.out.println("Hi there");
    }

    void associate(){
        ClassA classA = new ClassA();
        System.out.println(classA.getPrice());//assosiation
    }
}

package Class.OOP;

public class Car {
    public int year;
    String model;
    int price;
    String nameOwner;

    public Car(int year, String model) {
        this.year = year; //this - ссылка на конкретно этот объект
        this.model = model;
    }

    public Car(int price, String nameOwner, String model, int year) {
        this.price = price;
        this.nameOwner = nameOwner;
        this.model = model;
        this.year = year;
    }

    int test( int a){
        return a=5;
    }

    void PrintOwnerName() {
        System.out.println(nameOwner);
    }

    void PrintYear(){
        System.out.println(this.year);
    }
}

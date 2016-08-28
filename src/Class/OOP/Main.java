package Class.OOP;

import Class.OOP.Car;
import Class.OOP.IPhone;
import Class.OOP.Phone;

public class Main {
    public static void main(String[] args) {
        int a = 5;

        Car honda1 = new Car(2009, "Civic");

        Car honda2 = new Car(1500, "Jack", "Pilot", 2012);

        honda1.PrintOwnerName();
        honda1.PrintYear();

        honda2.PrintOwnerName();
        honda2.PrintYear();

        Phone phone = new Phone(1000, "S01", "Chine");
        Phone phone1 = new Phone();

        System.out.println(phone.getCost());
        System.out.println(phone.getOperatingSystem());
        phone.setOperatingSystem("iOs 9");
        System.out.println(phone.getOperatingSystem());
        System.out.println(phone1.getOperatingSystem());

        IPhone iPhone5 = new IPhone(700, "5CE", "USA");
        iPhone5.setOperatingSystem("iOs 9.3.5");
    }
}

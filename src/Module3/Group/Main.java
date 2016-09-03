package Module3.Group;
import java.util.Date;
/*
Create getters and setters for all fields and make fields private as OOP principle follows.
Create 5 objects Course class.
Create objects of others classes using every constructor.
You must have 13 objects in Solution class.
 */
public class Main {
    public static void main(String[] args) {
        Course cource1 = new Course(new Date(), "Filisofy of Egypt");
        Course cource2 = new Course(114, "Algebra", "Arhimed Vaganovich");
        Course cource3 = new Course(100, "Illusions", "David Blane");
        Course cource4 = new Course(new Date(), "What to do when you are a little girl");
        Course course5 = new Course(90, "How to wake up early", "CoBa");

        Course[] courses = {cource3, course5, cource2};

        Student student1 = new Student("Max", "Prince", 10);
        Student student2 = new Student("Roger", courses);

        CollegeStudent student3 = new CollegeStudent("Tom", "Cruze", 9);
        CollegeStudent student4 = new CollegeStudent("Perdeshmit", courses);
        CollegeStudent student5 = new CollegeStudent("Clark", "Kent", 10, "Supermen", 95, 101598);

        SpecialStudent student6 = new SpecialStudent("Bad", "Santa", 9, "Badass", 23, 109462);
        SpecialStudent student7 = new SpecialStudent("Shmidt", courses);
        SpecialStudent student8 = new SpecialStudent("Lucky", "Man", 10, 15268546);

    }
}

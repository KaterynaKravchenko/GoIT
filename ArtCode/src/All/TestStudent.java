package All;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Ivan";
        st1.birth = "1998 - 03 - 23";
        st1.taskCount = 100;
        st1.rank = 3;

        Student st2 = new Student();
        st2.name = "Serhii";
        st2.birth = "1992 - 05 - 23";
        st2.taskCount = 80;
        st2.rank = 5;

        Student[] list = new Student[6];
        list[0] = st1;
        list[1] = st2;


        Group myGroup = new Group();
        myGroup.name = "ACB14";
        myGroup.count = 10;
        myGroup.list = list;



        System.out.println(myGroup);

    }
}

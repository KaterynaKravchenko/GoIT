package All;

public class GroupToJson {
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

        Student st3 = new Student();
        st3.name = "Oleg";
        st3.birth = "1989 - 11 - 11";
        st3.taskCount = 95;
        st3.rank = 4;

        /*String st1ToJson = GroupJsonUtils.studentToJson(st1);
        System.out.println(st1ToJson);*/

        Student[] list = new Student[6];
        list[0] = st1;
        list[1] = st2;

        /*String listStudent = GroupJsonUtils.arrToJson(list);
        System.out.println(listStudent);*/

        Group allGroup = new Group();
        allGroup.name = "ACB14";
        allGroup.count = 10;
        allGroup.list = list;

        System.out.println();
        System.out.println(GroupJsonUtils.toJson(allGroup));
    }
}

package All;


public class GroupJsonUtils {
    public static String toJson(Group group) {
        String allJson = "All group:\n Name of group " + "\'" + group.name + "\'" + ",\n Count of group - " + group.count +
                ", \n Students of group " + group.name + " is \n" + arrToJson(group.list);

        return allJson;
    }

    public static String arrToJson(Student[] student) {
        String arrJson = "[";
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                arrJson = arrJson + "Student #" + i + ":" + "\n" + studentToJson(student[i]) + "\n";
            }
        }
        return arrJson + "]";
    }

    public static String studentToJson(Student student) {
        String studJson = "{ \n name: " + student.name + ",\n birth: " + student.birth + ",\n task made: " + student.taskCount
                + ",\n rank is " + student.rank + "\n}";
        return studJson;
    }
}

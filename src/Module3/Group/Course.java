package Module3.Group;
import java.util.Date;
/*
You need to create following structure of the classes.
Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName.
Create two constructors with fields startDate, name; and hourseDuration, name, teacherName.
 */
public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacgerName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }
    public Course(int hoursDuration, String name, String teacgerName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacgerName = teacgerName;
    }

    public Date getStartDate() { return startDate; }
    public String getName() { return name; }
    public int getHoursDuration() { return hoursDuration; }
    public String getTeacgerName() { return teacgerName; }

    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public void setName(String name) { this.name = name; }
    public void setHoursDuration(int hoursDuration) { this.hoursDuration = hoursDuration; }
    public void setTeacgerName(String teacgerName) { this.teacgerName = teacgerName; }
}

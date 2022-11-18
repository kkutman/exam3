package course;

import person.Student;

import java.time.LocalDate;
import java.util.Arrays;

public class Group  {
    private String GroupName;
    private Student[]students;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;

    public Group(String groupName, Student[] students, LocalDate dateOfStart, LocalDate dateOfFinish) {
        GroupName = groupName;
        this.students = students;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    public String getGroupName() {
        return GroupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public LocalDate getDateOfFinish() {
        return dateOfFinish;
    }

    @Override
    public String toString() {
        return "Group{" +
                "GroupName='" + GroupName + '\'' +
                ", students=" + Arrays.toString(students) +
                ", dateOfStart=" + dateOfStart +
                ", dateOfFinish=" + dateOfFinish +
                '}';
    }



}

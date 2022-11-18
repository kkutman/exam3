package course;

import person.Instructor;
import person.Mentor;

import java.util.Arrays;

public class Course {
    private String programming;
    private Group []groups;
    private Instructor instructor;
    private Mentor[] mentors;

    public Course(String programming, Group[] groups, Instructor instructor, Mentor[] mentors) {
        this.programming = programming;
        this.groups = groups;
        this.instructor = instructor;
        this.mentors = mentors;
    }

    public String getProgramming() {
        return programming;
    }

    public Group[] getGroups() {
        return groups;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    @Override
    public String toString() {
        return "Course{" +
                "programming='" + programming + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", instructor=" + instructor +
                ", mentors=" + Arrays.toString(mentors) +
                '}';
    }
}

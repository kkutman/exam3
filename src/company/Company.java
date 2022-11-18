package company;

import course.Course;
import person.Student;

import java.util.Arrays;

public abstract class Company {
    private String name;
    private String address;
    private Course[]courses;
    private String languageOfInstruction;

    public Company(String name, String address, Course[] courses, String languageOfInstruction) {
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.languageOfInstruction = languageOfInstruction;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Course[] getCourses() {
        return courses;
    }

    public String getLanguageOfInstruction() {
        return languageOfInstruction;
    }
    public   double income(Student[]students){
        double num = 0;
        for (Student student:students){
            num+= student.getContract();
        }
        return num;
    }



    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", languageOfInstruction='" + languageOfInstruction + '\'' +
                '}';
    }

}

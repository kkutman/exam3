package person;

import course.Group;

import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person{
    private double contract;


    public Student(Long id, String fullName, int age, char gender, double contract) {
        super(id, fullName, age, gender);
        this.contract = contract;
    } public double getContract() {
        return contract;
    }

    @Override
    public double period(Group group) {
        LocalDate localDate = LocalDate.now();
        LocalDate result = group.getDateOfFinish().minusYears(group.getDateOfStart().getYear()).minusMonths(group.getDateOfStart().getMonthValue()).minusDays(group.getDateOfStart().getDayOfMonth());
        return result.getMonthValue()*getContract();
    }

    public int compareTo(Student o)
    {
        if (this.getAge() != o.getAge()) {
            return this.getAge() ;
        }
        return this.getFullName().compareTo(o.getFullName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "contract=" + contract + getAge() +
                '}';
    }


}

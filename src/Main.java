import company.Peaksoft;
import course.Course;
import course.Group;
import person.Instructor;
import person.Mentor;
import person.Person;
import person.Student;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] student = {
                new Student(123l, "student1", 234, 'f', 12000.0),
                new Student(123l, "student2", 2323, 'f', 12000.0),
                new Student(123l, "student3", 23, 'f', 12000.0),
                new Student(123l, "student4", 24, 'f', 12000.0),
                new Student(123l, "student5", 2434, 'f', 12000.0),
        };
        Student[] student2 = {
                new Student(123l, "student11", 254, 'm', 15000.0),
                new Student(123l, "student22", 264, 'm', 12000.0),
                new Student(123l, "student33", 284, 'm', 12000.0),
                new Student(123l, "student44", 2344, 'm', 12000.0),
                new Student(123l, "student55", 2334, 'm', 12000.0),
        };

//        Instructor[] instructor = {
//                new Instructor(12l,"instructor1",234,'f',20000.0),
//                new Instructor(12l,"instructor1",234,'f',20000.0),
//        };
        Instructor instructor1 = new Instructor(12l, "instructor1", 34, 'f', 20000.0);
        Instructor instructor2 = new Instructor(12l, "instructor1", 24, 'f', 20000.0);

        Mentor[] mentors = {
                new Mentor(223l, "rahim", 32, 'm', 30000),
                new Mentor(223l, "muhamad", 32, 'm', 20000),
                new Mentor(223l, "maksat", 31, 'm', 10000),
        };

//        Group[] groups = {
//                new Group("java8", student, LocalDate.of(2022, 10, 3), LocalDate.of(2023, 7, 4)),
//                new Group("js8", student2, LocalDate.of(2022, 10, 3), LocalDate.of(2023, 7, 4)),
//        };
        Group group1= new Group("java8", student, LocalDate.of(2022, 10, 3), LocalDate.of(2023, 7, 4));
        Group group2 = new Group("js8", student2, LocalDate.of(2022, 10, 3), LocalDate.of(2023, 7, 4));

        Group [] groups = {group1,group2};
//        for (Group group : group1) {
//            System.out.println("jalpy okutuu ubaktysy: " + instructor1.period(group));
//            for (Mentor mentor : mentors) {
//                System.out.println("sallary: " + mentor.period(group));
//            }
//            for (Student student1 : student2) {
//                System.out.println("obshii kontract: " + student1.period(group));
//            }
        System.out.println("Жалпы окутуу убактысы: "+instructor1.period(group1)+ " ай");
        for (Mentor mentor : mentors) {
            System.out.println("Зарплата ментора: " + mentor.period(group1));
        }
//            }


        Course[] courses = {
                    new Course("java", groups, instructor1, mentors),
                    new Course("js", groups, instructor2, mentors)
            };
            Peaksoft peaksoft = new Peaksoft("Peaksoft House", "dom 123", courses, "kyrgiz");
            System.out.println("Бардык студенттердин контрагы: " + peaksoft.income(student));




        Person[] people = {instructor1,instructor2};
        Student.sortAge(student2);
        Student.sortAge(student);
        Mentor.sortAge(mentors);
        Person.sortAge(people);

        }
    }

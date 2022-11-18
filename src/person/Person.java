package person;

import course.Group;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Person {
    private Long id;
    private String fullName;
    private int age;
    private char gender;

    public Person(Long id, String fullName, int age, char gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public abstract double period(Group group);

    public static void sortAge ( Person[] people){


        Arrays.sort(people,new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.getAge() != p2.getAge())
                    return p1.getAge() - p2.getAge();
                return p1.getFullName().compareTo(p2.getFullName());
            }
        });

        System.out.println(Arrays.toString(people));
    }

    @Override
    public String toString() {
        return "Instructor :{" +
                " id: " + id +
                ", fullName: " + fullName + '\'' +
                ", age: " + age + getAge()+
                ", gender: " + gender+" }"
                ;
    }
}





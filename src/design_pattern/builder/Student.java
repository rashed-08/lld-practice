package design_pattern.builder;

import java.util.List;

public class Student {
    int rollNumber;
    String name;
    String fatherName;
    String motherName;
    int age;
    List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", age=" + age +
                ", subjects=" + subjects +
                "";
    }
}

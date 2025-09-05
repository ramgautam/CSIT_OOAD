package edu.uniglobe.lms.relationship.aggregation;
/**
 * Definition: A "Has-A" relationship where one class contains a reference to another, but they can exist independently.
 *
 * Key Point: It’s a weaker form of composition.
 *
 * Example: A Department has Teachers, but teachers can exist without the department.
 */

import java.util.*;

class Teacher {
    String name;
    Teacher(String name) { this.name = name; }
}

class Department {
    String deptName;
    List<Teacher> teachers; // Aggregation

    Department(String deptName, List<Teacher> teachers) {
        this.deptName = deptName;
        this.teachers = teachers;
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. John");
        Teacher t2 = new Teacher("Ms. Emma");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);

        Department dept = new Department("Computer Science", teacherList);

        System.out.println("Department: " + dept.deptName);
        for (Teacher t : dept.teachers) {
            System.out.println("Teacher: " + t.name);
        }
    }
}


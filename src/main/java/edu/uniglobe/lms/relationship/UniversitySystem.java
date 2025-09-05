package edu.uniglobe.lms.relationship;

import java.util.*;

// --- Association Example ---
// A Student can be associated with a Teacher
class Student {
    String name;
    Student(String name) { this.name = name; }
}

class Teacher {
    String name;
    Teacher(String name) { this.name = name; }

    public void teaches(Student s) {
        System.out.println(this.name + " teaches " + s.name); // Association
    }
}

// --- Aggregation Example ---
// A Department has Teachers (but Teachers can exist without Department)
class Department {
    String deptName;
    List<Teacher> teachers;

    Department(String deptName, List<Teacher> teachers) {
        this.deptName = deptName;
        this.teachers = teachers;
    }

    public void showTeachers() {
        System.out.println("Department: " + deptName);
        for (Teacher t : teachers) {
            System.out.println(" - Teacher: " + t.name);
        }
    }
}

// --- Composition Example ---
// A University has Departments (strong ownership)
// If University is destroyed, Departments don’t exist
class University {
    private List<Department> departments;

    University() {
        departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showUniversityDetails() {
        System.out.println("University contains following departments:");
        for (Department d : departments) {
            d.showTeachers();
        }
    }
}

// --- Main Program ---
public class UniversitySystem {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Create Teachers
        Teacher t1 = new Teacher("Dr. Smith");
        Teacher t2 = new Teacher("Prof. Emma");

        // --- Association ---
        t1.teaches(s1);
        t2.teaches(s2);

        // --- Aggregation ---
        List<Teacher> csTeachers = new ArrayList<>();
        csTeachers.add(t1);
        csTeachers.add(t2);
        Department csDept = new Department("Computer Science", csTeachers);

        // --- Composition ---
        University uni = new University();
        uni.addDepartment(csDept);

        // Show University Details
        uni.showUniversityDetails();
    }
}


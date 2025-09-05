package edu.uniglobe.lms.relationship.association;

/**
 * 1. Association
 *
 * Definition: A loose relationship between two classes, where one object uses another.
 *
 * Key Point: Both objects can exist independently.
 *
 * Example: A Teacher teaches Students, but both can exist without each other.
 */
class Teacher {
    String name;
    Teacher(String name) { this.name = name; }
}

class Student {
    String name;
    Student(String name) { this.name = name; }
}

public class AssociationExample {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Smith");
        Student s1 = new Student("Alice");

        // Association - Teacher teaches Student
        System.out.println(t1.name + " teaches " + s1.name);
    }
}

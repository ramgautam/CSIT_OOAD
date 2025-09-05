package edu.uniglobe.lms.relationship.composition;

/**
 * Definition: A "Part-of" relationship where one class owns another.
 *
 * Key Point: The lifetime of the contained object depends on the owner.
 *
 * Example: A House has Rooms → If the house is destroyed, rooms also don’t exist.
 */
class Room {
    String name;
    Room(String name) { this.name = name; }
}

class House {
    private Room room;  // Composition

    House(String roomName) {
        this.room = new Room(roomName); // Strong ownership
    }

    public void showHouse() {
        System.out.println("House has a room: " + room.name);
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        House house = new House("Living Room");
        house.showHouse();
    }
}

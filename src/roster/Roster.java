/*
 * Lab 9 Quiz
 * Name:
 */

package roster;

import java.util.*;

class Roster {

    // Add a student to the roster through the given info.
    void addStudent(int id, String name, int gradYear) {

    }

    // Print the total number of students in the roster.
    // Format of printing: Number of Students: Number
    // eg. Number of Students: 5
    void printNumOfStudents() {

    }

    // Print the info of the student who has the given ID number.
    // Format of printing: ID: Name, Graduation Year
    // eg. 100150: Daniel, 2018
    void printStudentInfo(int id) {

    }

    // Print all the students' info SORTED by students' names.
    // Format of printing: Name, Graduation Year
    // eg. Anthony, 2018
    //     Brian, 2019
    //     Carol, 2018
    void printRoster() {

    }

    // Do not change main()
    public static void main(String args[]) {
        Roster roster = new Roster();

		System.out.println("Starting roster program...");

        roster.addStudent(100183, "James", 2018);
        roster.addStudent(100219, "Mary", 2019);
        roster.addStudent(100317, "John", 2018);
        roster.addStudent(100310, "Patricia", 2018);
        roster.addStudent(100120, "Robert", 2019);
        roster.addStudent(100264, "Linda",2019 );
        roster.addStudent(100425, "Michael", 2019);
        roster.addStudent(100148, "Barbara", 2018);
        roster.addStudent(100100, "William", 2018);

        roster.printNumOfStudents();
        System.out.println();
        roster.printStudentInfo(100219);
        roster.printStudentInfo(100120);
        roster.printStudentInfo(100425);
        System.out.println();
        roster.printRoster();
    }
}

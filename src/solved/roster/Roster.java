/*
 * Lab 9 Quiz
 * Name:
 */

package solved.roster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Roster {

	HashMap<Integer, Student> students;

	public Roster() {
        /* A HashMap relates a key to a value. In this case we relate
          a student ID represented as an integer to a Student object.
         */
		students = new HashMap<Integer, Student>();
	}

    // Add a student to the roster through the given info.
    void addStudent(int id, String name, int gradYear) {
		Student s = new Student(id, name, gradYear);
		students.put(id, s);

    }

    // Print the total number of students in the roster.
    // Format of printing: Number of Students: Number
    // eg. Number of Students: 5
    void printNumOfStudents() {
		System.out.println(students.size() + " students.");
    }

    // Print the info of the student who has the given ID number.
    // Format of printing: ID: Name, Graduation Year
    // eg. 100150: Daniel, 2018
    void printStudentInfo(int id) {
		Student s;
		s = students.get(id);
		if(s == null) {
			System.out.println("No such student");
			return;
		}
		System.out.println(s);
    }

    // Print all the students' info SORTED by students' names.
    // Format of printing: Name, Graduation Year
    // eg. Anthony, 2018
    //     Brian, 2019
    //     Carol, 2018
    void printRoster() {
		ArrayList<Student> sortedStudents = new ArrayList<Student>();
		sortedStudents.addAll(students.values());

		Collections.sort(sortedStudents);

		for(Student s: sortedStudents) {
			System.out.println(s);
		}

    }

    // Do not change main()
    public static void main(String args[]) {
        Roster roster = new Roster();

		System.out.println("Starting roster program...");

        roster.addStudent(100183, "James", 2021);
        roster.addStudent(100219, "Mary", 2019);
        roster.addStudent(100317, "John", 2018);
        roster.addStudent(100310, "Patricia", 2022);
        roster.addStudent(100120, "Roberto", 2019);
        roster.addStudent(100264, "Linda",2019 );
        roster.addStudent(100425, "Michael", 2019);
        roster.addStudent(100148, "Barbara", 2022);
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

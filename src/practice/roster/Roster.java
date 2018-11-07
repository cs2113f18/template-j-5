/*
 * Lab 9 Quiz
 * Name:
 */

package practice.roster;

class Roster {

    /* A HashMap relates a key to a value. In this case we relate
    a student ID represented as an integer to a Student object.
    */
//	HashMap<XXXX, YYYYY> students;

	public Roster() {

//		students = new HashMap<XXXX, YYYYY>();
	}

    // Add a student to the roster through the given info.
    void addStudent(int id, String name, int gradYear) {
		Student s = new Student(id, name, gradYear);
//		students.put(id, s);

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
		Student s = null;
		// get the student from the Hashmap
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
		// A HashMap itself can't be sorted, so add all of its elements to a data structure that supports
        // sorting, like an ArrayList. Then use Collections.sort to order it.

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

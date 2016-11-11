
package roster;


class Student implements Comparable<Student> { // Do not change this line

	private int id;
	private String name;
	private int gradYear;


	public Student(int id, String name, int gradYear) {
		this.id = id;
		this.name = name;
		this.gradYear = gradYear;
	}

	public String toString(){
		String s = name + ": " + gradYear + " id: " + id;
		return s;
	}

	@Override
	public int compareTo(Student student) {

		return name.compareTo(student.name);
		// return -1 if my year < student's year
		// else 0 if equal
		// else 1 if other student has a higher year than me
//
//		if(gradYear < student.gradYear)
//			return -1;
//		else if(gradYear == student.gradYear)
//			return 0;
//		else
//			return 1;
	}
}


package solved.roster;


class Student implements Comparable<Student> {

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

		/* Sort by year and then name */
		if(gradYear < student.gradYear)
			return -1;
		else if(gradYear == student.gradYear)
			return name.compareTo(student.name);
		else
			return 1;
	}
}

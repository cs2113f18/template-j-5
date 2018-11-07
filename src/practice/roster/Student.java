
package practice.roster;


class Student {

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

}

package Comparencollections;

public class Student implements Comparable<Student>{
	private int id;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return -(this.id - o.id);
	}

}

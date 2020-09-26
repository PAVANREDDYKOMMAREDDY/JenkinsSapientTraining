package Comparencollections;

import java.util.Comparator;

public class ComparatorFunctionality implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		return (o1.getId()-o2.getId());
	}

}

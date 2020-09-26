package Comparencollections;

import java.util.ArrayList;
import java.util.Collections;

public class MainFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ls=new ArrayList<Student>();
	ls.add(new Student(1));
	ls.add(new Student(3));
	ls.add(new Student(2));
		//Collections.sort(ls);
		Collections.sort(ls,new ComparatorFunctionality());
	
		for (Student movie: ls) 
        { 
            System.out.println(movie.getId() + " "  
                               ); 
        } 
	}

}

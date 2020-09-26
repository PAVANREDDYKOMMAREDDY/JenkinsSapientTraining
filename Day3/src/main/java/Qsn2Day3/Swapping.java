package Qsn2Day3;

import java.util.ArrayList;
import java.util.List;

public class Swapping {
	public static <T> T[] swap(T [] list, int firstPos, int secondPos) 
	{	
		try{
		T temp=list[firstPos];list[firstPos]=list[secondPos];list[secondPos]=temp;
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> ls=new ArrayList<Integer>();
		ls.add(1);ls.add(3);ls.add(10);Object[] o1=swap(ls.toArray(),0,1);
		for(Object i:o1) {
			System.out.println(i.toString());
		}
	}
}

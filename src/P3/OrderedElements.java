package P3;

import java.util.ArrayList;
import java.util.List;

public class OrderedElements 
{

	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>();
		
		//list is an interface which is implemented by arraylist class
		
		l1.add(60);
		l1.add(70);
		l1.add(10);
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(40);
		l1.add(null);
		l1.add(null);
		
		System.out.println("List elements: " + l1);
		System.out.println("-----------------");
		int i1 = l1.get(1);
		int i2 = l1.get(3);
		int i3 = l1.get(4);
		//System.out.println(i1 + " " +i2 +" " +i3);
		System.out.println("-----------------");
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i) + " ");
		}
	}
}
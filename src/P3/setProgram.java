package P3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setProgram 
{

	public static void main(String[] args) 
	{
		Set<Integer> s1 = new HashSet<Integer>();
		
		s1.add(50);
		s1.add(60);
		s1.add(10);
		s1.add(10);
		s1.add(20);
		s1.add(20);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(null);
		s1.add(80);
		s1.add(null);
		System.out.println("Set elements:" +s1);
		
		//converting HashSet to Array
		Integer[] s2 = s1.toArray(new Integer[s1.size()]);
		
		//System.out.println(s2[2] +" " +s2[3]);
		
		//System.out.println(s1[2] +" " +s1[3]);
		
        for(var x : s1)
        {
        	System.out.println(x);
        }
	}

}
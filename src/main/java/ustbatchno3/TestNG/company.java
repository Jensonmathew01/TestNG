Java8 program to multiply two elements of arraylist.
***************************************************	
package ustbatchno3.TestNG;

import java.util.*;
import java.util.stream.Collectors;;

public class company{


	public static List<Integer> total1()
	{
	 List<customer> a=new ArrayList<customer>();
	 a.add(new customer("Trivandrum",1600,800,1,"Jenson",3));
	 a.add(new customer("Chennai",1800,1000,2,"Christho",2));
	 a.add(new customer("Hyderbad",2000,900,3,"Anikuttan",4));
	 a.add(new customer("Mumbai",2500,1200,4,"Blassooon",5));
	 a.add(new customer("Cochin",1800,1200,5,"Kevin",6));
     List<Integer> m=a.stream().map(t->t.getPrice_with_material()*t.getSquareft()).collect(Collectors.toList());
	 return m;
	}
	public static List<Integer> total2()
	{
		 List<customer> a=new ArrayList<customer>();
		 a.add(new customer("Trivandrum",1600,800,1,"Jenson",3));
		 a.add(new customer("Chennai",1800,1000,2,"Christho",2));
		 a.add(new customer("Hyderbad",2000,900,3,"Anikuttan",4));
		 a.add(new customer("Mumbai",2500,1200,4,"Blassooon",5));
		 a.add(new customer("Cochin",1800,1200,5,"Kevin",6));
         List<Integer> n=a.stream().map(t->t.getPrice_without_material()*t.getSquareft()).collect(Collectors.toList());
		 return n;
	}
	public static void main(String args[])
	{
		System.out.println(total1());
		System.out.println(total2());
	}
}




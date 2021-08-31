package arrayListdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArraylists {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		
		a1.add(3);
		a1.add(5);
		a1.add(8);
		System.out.println(a1);
		
		a2.add(3);
		a2.add(5);
		System.out.println(a2);
		
		System.out.println("");
		System.out.println("----------RemoveAll method for comparing elements in 2 arraylists");
		a1.removeAll(a2);
		System.out.println("Elements not matched in a1 " + a1);
		
		a2.removeAll(a1);
		System.out.println("Elements not matched in a2" + a1);
		
		System.out.println("----------Equals method for comparing elements in 2 arraylists");
		
		
		//compare using equals method
		
		if(a1.equals(a2)==true)
			System.out.println("Arraylist are equal");
		
		else
			System.out.println("Arraylists are not equals");
				
		a2.add(8);
		System.out.println(a1);
		System.out.println(a2);
		if(a1.equals(a2)==true)
			System.out.println("Arraylist are equal");
		
		else
			System.out.println("Arraylists are not equals");
				
		a1.removeAll(a2);
		System.out.println("Elements not matched " + a1);
		
		ArrayList<String> firstList=new ArrayList<String>(Arrays.asList("M", "W", "J", "K", "T"));  
		System.out.println("First arraylist: ");  
		System.out.println(firstList);  
		//second arraylist      
		List<String> secondList=new ArrayList<String>(Arrays.asList("M", "W", "E", "K", "T"));  
		System.out.println("Second arraylist: ");  
		System.out.println(secondList);  
		//returns the common elements in both list  
		secondList.retainAll(firstList);        
		System.out.println("Common elements in both list: ");  
		System.out.println(secondList);  
			
	}

}

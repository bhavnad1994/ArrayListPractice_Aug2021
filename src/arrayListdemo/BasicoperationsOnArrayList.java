package arrayListdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicoperationsOnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> languages =new ArrayList<String>();
		languages.add("Java");
		languages.add("C");
		languages.add("C++");
		languages.add("Python");
		languages.add("Ruby");
		languages.add(".Net");
		languages.add("C#");
		
		System.out.println(languages);
		
		System.out.println("*******Iterating over elements**********");
		for (String language : languages) {
		      System.out.println(language);
		     
		    }
		
		System.out.println("******get elements**********");
		System.out.println(languages.get(2));
		
		
		System.out.println();
		System.out.println("*******Set elements**********");
		languages.set(6, "R");
		for (String language : languages) {
		      System.out.println(language);
		     
		    }
		
		System.out.println("*******operations on elements**********");
		System.out.println(languages.size());
		System.out.println(languages.isEmpty());
		System.out.println(languages.contains("T"));
		System.out.println(languages.contains("R"));
		
		System.out.println("*******Convert ArrayList to array**********");
		
		System.out.println(languages.toArray());
		String[] array=new String[languages.size()];
		System.out.println(languages.toArray(array));
		// access elements of the array
	    for (String item : array) {
	      System.out.print(item + ", ");
	    }
	    
	    System.out.println("*******Convert  array to ArrayList**********");
	    ArrayList<String> lang = new ArrayList<>(Arrays.asList(array));
	    System.out.println("\nArrayList: " + lang);
	  
	    System.out.println("*******Convert  ArrayList to String**********");
	 // convert ArrayList into a String
	    String str = languages.toString();
	    System.out.println("String: " + str);
	    
	    
	    System.out.println("*******Create arraylist using List**********");
	 
	    List<String> l = new ArrayList<>();
	    l.add("Java");
	    l.add("Python");
	    l.add("C");
	    System.out.println(l);
	    
	    System.out.println("*******Sort arrayList**********");
	    System.out.println("ArrayList: " + l);
	    Collections.sort(l); //ascending order
	    for (String items : l) {
	         System.out.println(items);
	    }
	    System.out.println();
	    System.out.println("descending order");
	    Collections.reverse(l);
	    for (String items : l) {
	         System.out.println(items);
	    }
	    
	   		
	}

}

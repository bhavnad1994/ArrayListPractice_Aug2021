package arrayListdemo;

import java.util.ArrayList;

public class ArrayListRealTimeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Maroon");
		colors.add("Red");
		
		for(String item: colors) {
			System.out.println(item);
		}
		
		System.out.println("----------------------");
		ArrayList<String> color=new ArrayList<String>();
		color.add("Yellow");
		color.add("Pink");
		color.add("Purple");
		color.add("Red");
		for(String item: colors) {
			System.out.println(item);
		}
		
		System.out.println("----------------------");
		//compare 2 arraylists
		ArrayList<String> C3=new ArrayList<String>();
		for(String a1: colors) {
			C3.add(color.contains(a1) ? "yes" : "No");
						
			System.out.println(C3);
		}

		
		
		
		
		color.retainAll(colors);
		System.out.println("Common elements in both list: ");  
		System.out.println(color);  
		
	}

}

package arrayListdemo;

import java.util.ArrayList;

public class IteratingArrayListElements {

	public static void main(String[] args) {
	
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		int arrSize=arr1.size();
		System.out.println("Size of arrayList is " + arrSize);
		for(int i=0;i<arrSize;i++) {
        System.out.println(arr1.get(i));
	}
		
		
		arr1.add(300);
		arr1.add(30);
		arr1.add(459);
		arr1.add(23);
		
		System.out.println("Size of arrayList is after adding elements  " + arr1.size());
		for(int i=0;i<arr1.size();i++) {
        System.out.println(arr1.get(i));
	}
		
		arr1.add(5);
		arr1.add(67);
		System.out.println("after modifying the elements in arraylist,size of arraylist is  " + arr1.size());
		for(Integer items:arr1){
			System.out.println(items);
		}
		
		arr1.remove(3);
		System.out.println("after deleting the elements in arraylist,size of arraylist is  " + arr1.size());
		int counter=0;
		while(arr1.size() > counter) {
			 System.out.println(arr1.get(counter));
			 counter++;
			
		}
		
		
		
		
		
}
}
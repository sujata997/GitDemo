package javastreamsfrom115;

import java.util.ArrayList;



public class test1 {
     
	public static void main(String[] args) {
		//count the number of name starting with alphabet A in list
		ArrayList<String> names= new ArrayList<String>();
		//Storing the name
		names.add("Abhi");
		names.add("Suajata");
		names.add("Abhinav");
		names.add("Anvi");
		names.add("Lata");
		
		int count =0;          //here we dont have any name which is starting from A
		// iterating one by one
		for(int i=0;i<names.size();i++) { //size will give the count
			String actual = names.get(i); // get will give tha all name one by one
			/*if(actual.startsWith("A")) {
				count++;  // it will count the name which is Starts from A
			}*/
			System.out.println(actual);
		}
//System.out.println(count);
	}

}

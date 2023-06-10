package javastreamsfrom115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class streamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names= new ArrayList<String>();
		//Storing the name
		names.add("man");
		names.add("Don");
		names.add("woman");
		
		//print names which have last letter as "a" with uppercase means convert in uppercase
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));//here ue used map for modification
		
		//print names which have first letter as "A" with uppercase and sorted
		//converting arrat to arraylist
	List<String>names1=	Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama");
	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	//Merging 2 different list
	Stream<String> newstream = Stream.concat(names.stream(), names1.stream());
	//newstream.sorted().forEach(s->System.out.println(s));
	//To check wheather adam is present in list or not
	boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("Adam"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	
	
		

	}

}

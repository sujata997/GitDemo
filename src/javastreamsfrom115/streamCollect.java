package javastreamsfrom115;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conveting stream to list
		 List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				 .collect(Collectors.toList());
		 System.out.println(ls.get(0));
		 
		 
		List<Integer> values = Arrays.asList(3,2,2,1,5,7,1,9);
		 //print the unique number from this number
		 //sort the array
		//values.stream().distinct().forEach(s->System.out.println(s));
		//List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		//System.out.println(li.get(2));
		
		//print the sum of number
		//Optional<Integer> sum = values.stream().reduce((a,b)->a+b);
		//System.out.println(sum.get());	
		
		//print the subtract no
		//Optional<Integer> sub = values.stream().reduce((a,b)->a-b);
		//System.out.println(sub.get());
		
		Optional<Integer> pro = values.stream().reduce((a,b)->a*b);
		System.out.println(pro.get());
		
		
		
		

	}

}

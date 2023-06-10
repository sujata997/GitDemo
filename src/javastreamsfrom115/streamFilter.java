package javastreamsfrom115;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class streamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count the number of name starting with alphabet A in list
				ArrayList<String> names= new ArrayList<String>();
				//Storing the name
				names.add("Abhi");
				names.add("Suajata");
				names.add("Abhinav");
				names.add("Anvi");
				names.add("Lata");
				
				//step-1 here we are converting existing arraylist into Stream
				//step-2 then we are applying filter method intermediate opertion
				//step-3 last we are giving life to the strem using terminal opertion
				long c = names.stream().filter(s->s.startsWith("A")).count();
				System.out.println(c);
				
				// there is no life for intermediate opertion if there is no terminal op
				//terminal op will excute only if intermediate op(filter) will return true this apply for filter
				//we can create stream
			long d = Stream.of("Abhijeet","sujata","Aryan","Anvi").filter(s->
				{
					s.startsWith("A");
					//return false;// it will not execute if filter will return false
					return true;
				}).count();
			System.out.println(d);
			//print all the names which have greater than 4 character
			//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			//print the first name of all arraylist
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
				

	}

}

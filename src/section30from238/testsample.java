package section30from238;

import java.io.IOException;
import java.util.ArrayList;

public class testsample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Datadrivensection26 data=new Datadrivensection26();
		ArrayList d = data.getData("Delete Profile");
		
		System.out.println(d.get(0));
		System.out.println(d.get(1));
		System.out.println(d.get(2));
		System.out.println(d.get(3));

	}

}

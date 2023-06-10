package javastreamsfrom115;

import org.testng.annotations.Test;

public class PS1 extends PS{
	
	@Test
	public void testRun() {
		/*PS obj=new PS(); //1st way by creating object we can call method in another class
		obj.demo();*/
		//demo();  2nd way is using inheritance we can call method direclty
		
		int a=3; //i have to perform action on this variable it could be generic
		demo();
		PS2 ps2= new PS2(3);
		System.out.println(ps2.Increment());
		System.out.println(ps2.Decrement());
		System.out.println(ps2.multiplyThree());
		System.out.println(ps2.multiplytwo());
		
		
		
		
		
	}

}

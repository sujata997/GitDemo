package javastreamsfrom115;

import org.testng.annotations.Test;

public class PS2 extends PS3 {
	
	int a;
	
	public PS2(int a) {
		super(a);
		this.a=a;
	}
	

	@Test
	public int Increment() {
		 a=a+1;
		 return a;
		
	}
	
	@Test
	public int Decrement(){
		a=a-1;
		return a;
	}

}

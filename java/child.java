package codingtask;

public class child extends Parent {
	
	
	public void demo()
	{
		System.out.println("hi am child class method");
	}

	public static void main(String[] args) {
		
		Parent c=new child();
		c.demo();
		
	}

} 

output: hi am child class method


package codingtask;

public class NumberSeries {

	public static void main(String[] args) {
		
		int n=7,p=0;
		
		for(int i=1;i<=n;i++)
		{
			p=(p*10)+i;
			
			System.out.print(" * "+p);
		}
		
		
		

	}

}

output : * 1 * 12 * 123 * 1234 * 12345 * 123456 * 1234567

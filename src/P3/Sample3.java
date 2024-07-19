package P3;

public class Sample3 implements Sample2
{
	public void signature()
	{
		System.out.println("this is my signature");
	}
	
	
	

	public static void main(String[] args) 
	{
		Sample3 s3 = new Sample3();
		s3.signature();
		//eat(); - undefined in Sample3
		System.out.println(x);
		System.out.println(s3.y);
		
		int x = 1000;
		x = 2000;
		
		final int  y = 20000; 
		//y = 30000;
		
	

	}




	
}

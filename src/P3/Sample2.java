package P3;

interface Sample2
{

	static int x=12;
	int y=13;
	
	public void signature();
	
	
	private void sleep() 
	{
		System.out.println("this is my sleep time");
	}
	
	//protected void eat(); - illegal modifier
	
	static void eat() 
	{
		System.out.println("this is my eating time");
	}

}

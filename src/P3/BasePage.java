package P3;

public abstract class BasePage 
{
	static int x=12;
	int y=13;
	
	public void test1() 
	{
		System.out.println("inside test1");
	}

	private void test2() 
	{
		System.out.println("inside test2");
	}

	protected void test3() 
	{
		System.out.println("inside test3");
	}

	static void test4() 
	{
		System.out.println("inside test4");
	}
	
	public abstract void useOneCrore();
	
	public final void test100()
	{
		System.out.println("inside final method");
	}
	
}

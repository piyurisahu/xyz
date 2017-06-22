
public class OverridingOverloadingTest {

}


class A
{

	public  A() {
		
		// TODO Auto-generated constructor stub
	}
	static void C()
	{}
	
	
	private void Z()
	{}
	}
class B extends A
{
	/*int  add()
	{}*/
	static void C()
	{}
	public void Z()
	{}
}
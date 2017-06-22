
public class ConversionFromStringToInt 
{
	public static void main(String[] args)
	{
	String s="00000878";
	int i=Integer.parseInt(s);
	
	///same are Float.parseFloat();
	System.out.println(i);
	
	int j=Integer.valueOf(s);
	System.out.println(j);
	}
	
	

}

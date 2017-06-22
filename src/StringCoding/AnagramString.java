package StringCoding;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="triangle";
		String s2="integral";
		System.out.println(checkAnagram(s1,s2));
	}

	public static boolean checkAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		char[] charArray1=s1.toCharArray();
		StringBuilder second=new StringBuilder(s2);
		for(char c:charArray1)
		{
			int index=second.indexOf(""+c);
			if(index!=-1)
			{
				second.deleteCharAt(index);		}else return false;
			
		


		/*if(charArray1.length!=charArray2.length)
			return false;*/
		/*for(int i=0;i<charArray1.length;i++)
		{
			for(int j=0;j<charArray2.length;j++)
			{
				if(charArray2[j]==charArray1[i])
				{
					break;
				}
			}*/
	}
		return (second.length()==0?true:false);
	}
	
	public static boolean isAnaram(String s1,String s2)
	{
		char[] array1=s1.toCharArray();
		char[] array2=s2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		return Arrays.equals(array1, array2);
	}

}
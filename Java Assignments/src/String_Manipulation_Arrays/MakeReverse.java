package String_Manipulation_Arrays;

import java.util.Scanner;

public class MakeReverse {
	
	static String makeReverse(String str)
	{
		String reverse="";
		String word[]=str.split("\\s");
		for(int i=0;i<word.length;i++)
		{
			StringBuilder sb= new StringBuilder(word[i]);
		    sb.reverse();
			reverse=reverse+sb.toString()+" ";
		}
		return reverse.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter sentence:");
      String str=sc.nextLine();
      String rev=makeReverse(str);
      System.out.println("reverse:"+rev);
	}

}

package String_Manipulation_Arrays;

import java.util.Scanner;

public class Find_Replace {
	
	static String findReplace(String str,String given,String source)
	{
		return str.replace(given, source);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter sentence:");
       String str=sc.nextLine();
       System.out.println("Enter word to be replaced:");
       String given=sc.nextLine();
       System.out.println("Enter word to replace the given word");
       String source=sc.nextLine();
       String res=findReplace(str,given,source);
       System.out.println("result:"+res);
	}

}

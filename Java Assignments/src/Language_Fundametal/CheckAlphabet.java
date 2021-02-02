package Language_Fundametal;

import java.util.Scanner;

public class CheckAlphabet {
	
	static boolean checkAlpha(char alph)
	{
		if(alph=='A'||alph=='E'||alph=='I'||alph=='O'||alph=='U'||alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char alph;
       System.out.println("Enter Alphabet:");
       Scanner sc=new Scanner(System.in);
       alph=sc.next().charAt(0);
       boolean x=checkAlpha(alph);
       System.out.println("Is Vowel?="+x);
	}

}

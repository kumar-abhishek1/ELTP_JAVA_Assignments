package String_Manipulation_Arrays;

import java.util.Scanner;

public class CheckOccurences {
	
	static int check(String sentence,String word)
	{
		String arr[]=sentence.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(word.equals(arr[i]))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String sentence,word;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter sentence:");
      sentence=sc.nextLine();
      System.out.println("Enter word:");
      word=sc.next();
      int num=check(sentence,word);
      System.out.println("No. of Occurences= "+num);
      
	}

}

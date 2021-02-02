package String_Manipulation_Arrays;

import java.util.Scanner;
import java.util.ArrayList;


public class findPrime {
	
	static Integer[] findPrimeNumbers(int n1,int n2)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=n1;i<=n2;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					flag=1;
			}
			if(flag==0)
			{
				al.add(i);
			}
		}
		Integer arr[]=new Integer[al.size()];
		arr=al.toArray(arr);
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Range:");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      Integer arr[]=findPrimeNumbers(n1,n2);
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.println(arr[i]);
      }
	}

}

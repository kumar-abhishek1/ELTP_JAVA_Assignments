package Language_Fundametal;

import java.util.Scanner;


public class IsPrimeNumber {
	
	static boolean IsPrimeNumber(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        num=sc.nextInt();
        boolean x=IsPrimeNumber(num);
        System.out.println("IsPrimeNumber="+x);
	}

}

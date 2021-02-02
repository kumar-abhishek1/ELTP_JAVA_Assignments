package Language_Fundametal;

import java.util.Scanner;

public class printPrimeNumbers {
	
	void printPrime(int num)
	{
		System.out.println("Prime Numbers are:");
		System.out.print("2 ");
		for(int i=3;i<=num;i=i+2)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num;
      System.out.println("Enter the Number:");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      printPrimeNumbers obj=new printPrimeNumbers();
      obj.printPrime(num);
      
	}

}

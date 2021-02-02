package Language_Fundametal;

import java.util.Scanner;

public class CalculateInterest {
	
	static double calInterest(int amt)
	{
		double intr;
		if(amt<=1000)
		{
			intr=amt*0.04;
		}
		else if(amt>1000 && amt<=5000)
		{
			intr=amt*0.045;
		}
		else
		{
			intr=amt*0.05;
		}
		return intr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int amt;
      System.out.println("Enter Amount:");
      Scanner sc=new Scanner(System.in);
      amt=sc.nextInt();
      double interest=calInterest(amt);
      System.out.println("Interest="+interest);
	}

}

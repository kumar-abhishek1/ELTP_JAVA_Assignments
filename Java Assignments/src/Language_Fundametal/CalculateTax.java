package Language_Fundametal;

import java.util.Scanner;

public class CalculateTax {
	
	static double calTax(int gp)
	{
		double tax;
		if(gp<=240)
		{
			tax=gp*0.0;
		}
		else if(gp>240 && gp<=480)
		{
			tax=gp*0.15;
		}
		else
		{
			tax=gp*0.8;
		}
		return tax;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int gp;
	      System.out.println("Enter Gross Pay:");
	      Scanner sc=new Scanner(System.in);
	      gp=sc.nextInt();
	      double tax=calTax(gp);
	      System.out.println("Tax="+tax);

	}

}

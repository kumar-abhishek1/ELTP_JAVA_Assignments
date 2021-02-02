package Language_Fundametal;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

	static int calMax(int x,int y,int z)
	{
		if(x>=y && x>=z)
			return x;
		else if(y>=x && y>=z)
			return y;
		else
			return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		System.out.println("Enter Three Numbers");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		int max=calMax(x,y,z);
		System.out.println("Maximum Number="+max);

	}

}

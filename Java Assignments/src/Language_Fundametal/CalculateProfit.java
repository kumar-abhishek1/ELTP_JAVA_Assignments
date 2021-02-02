package Language_Fundametal;

import java.util.Scanner;

public class CalculateProfit {
	
	static float calculateProfit(int numAttendees)
	{
		int ticketPrice=5*numAttendees;
		float cost=20+(0.50f*numAttendees);
		float income=ticketPrice-cost;
		return income;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int numAttendees;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number of Attendees:");
       numAttendees=sc.nextInt();
       float profit=calculateProfit(numAttendees);
       System.out.println("Profit="+profit);
	}

}

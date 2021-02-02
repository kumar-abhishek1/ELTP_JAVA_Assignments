package String_Manipulation_Arrays;


import java.util.Scanner;

public class FindPosition {
	
	static int findPosition(int num,int nos[])
	{
		int index=-1;
		for(int i=0;i<=nos.length;i++)
		{
			if(nos[i]==num)
			{
				index=i;
				break;
			}
		}
		return index+1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num,size;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size");
      size=sc.nextInt();
      int nos[]=new int[size];
      System.out.println("Enter Numbers:");
      for(int i=0;i<size;i++)
      {
    	  nos[i]=sc.nextInt();
      }
      System.out.println("Enter number to be find:");
      num=sc.nextInt();
      int index=findPosition(num,nos);
      System.out.println("Position is at index:"+index);
      
      
      
	}

}

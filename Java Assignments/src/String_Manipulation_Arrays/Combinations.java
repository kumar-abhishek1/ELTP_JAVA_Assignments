package String_Manipulation_Arrays;

import java.util.Scanner;
import java.util.ArrayList;

	
public class Combinations {
	public  static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
	static String[] permute(String str, int l, int r,ArrayList<String> al) 
    { 
		
        if (l == r)
          al.add(str);
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r,al); 
                str = swap(str,l,i); 
            } 
        } 
        String arr[]=new String[al.size()];
        arr=al.toArray(arr);
        return arr;
        
    } 
	static String[] findCombinations(String str)
	{
		int n=str.length();
		ArrayList<String> al=new ArrayList<String>();
		
		String arr[]=permute(str,0,n-1,al);
		return arr;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      String str=sc.nextLine();
      String res[]= findCombinations(str);
      for (String obj : res) {
		System.out.println(obj);
	}
      
	}

}

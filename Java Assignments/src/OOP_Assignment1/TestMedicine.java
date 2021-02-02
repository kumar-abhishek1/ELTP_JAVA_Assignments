package OOP_Assignment1;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Medicine m[]=new Medicine[10];
       double i=Math.random()*3;
       int r=(int)i;
       r=r+1;
       System.out.println(r);
       switch(r)
       {
    	  case 1:m[0]=new Medicine();
    	         m[0].displayLabel();
                 m[1]=new Tablet();
                 m[1].displayLabel();
                 break;
          
    	  case 2:m[2]=new Medicine();
    	         m[2].displayLabel();
                 m[3]=new Syrup();
                 m[3].displayLabel();
                 break;
                 
    	  case 3:m[4]=new Medicine();
    	         m[4].displayLabel();
                 m[5]=new Ointment();
                 m[5].displayLabel();
       }
	}

}

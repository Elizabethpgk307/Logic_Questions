package Logic_ques;
import java.util.Scanner;

public class primefactor{
   public static void main(String args[]){
	   
   Scanner s=new Scanner(System.in);
     int num,i;
     System.out.println("Enter the number:");
     num=s.nextInt();
     for(i=2;i<num;i++)
     {
    	 while(num%i==0)
    	 {
    		 System.out.println(i+" ");
    		 num=num/i;
    	 }
     }
    	 if(num<2)
    	 {
    		 System.out.println(num);
    	 }
     }
   }

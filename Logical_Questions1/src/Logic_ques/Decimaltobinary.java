package Logic_ques;
import java.util.Scanner;
public class Decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 int n, count = 0, a;
	        String x = "";
	        System.out.print("Enter any decimal number:");
	        n = s.nextInt();
	        while(n > 0)
	        {
	            a = n % 2;
	            if(a == 1)
	            {
	                count++;
	            }
	            x = a + "" + x;
	            n = n / 2;
	        }
	        System.out.println("Binary number:"+x);
	       
		
		

	}

}

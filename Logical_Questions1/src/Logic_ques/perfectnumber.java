package Logic_ques;
import java.util.Scanner;
public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int n, sum = 0,i;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter the number:");
		        n = s.nextInt();
		        for(i=1;i<n;i++)
		        {
		        	if(n%i==0)
		            {
		                sum=sum+i;
		            }
		        }
		        if(sum==n)
		        {
		            System.out.println("Number is Perfect");
		        }
		        else
		        {
		            System.out.println("Number is not Perfect");
		        }    
		    }
}
		

package Logic_ques;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
        int n=s.nextInt();
        int fact=1,i=1;
        while(i<=n)
        {
        	fact=fact*i;
            i++;
        	
        }
        
        System.out.print(fact);
	}

}

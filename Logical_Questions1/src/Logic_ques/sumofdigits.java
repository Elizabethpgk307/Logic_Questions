package Logic_ques;
import java.util.Scanner;
public class sumofdigits {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.println(sum);
		
	}

}

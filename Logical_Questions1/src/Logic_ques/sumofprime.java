package Logic_ques;
import java.util.Scanner;
public class sumofprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1=s.nextInt();
		System.out.println("Enter the second number:");
		int n2=s.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+i;
				}
			}
		}
		System.out.println(sum);

	}

}

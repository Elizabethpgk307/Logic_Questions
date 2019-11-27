package Logic_ques;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int i,count=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
				
			}
		}
			if(count==0)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not prime");
			}
		}

	}




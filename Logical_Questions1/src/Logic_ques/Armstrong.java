package Logic_ques;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int arm=0,r,num=n;
		while(n>0)
		{
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
		}
		if(num==arm)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}

}

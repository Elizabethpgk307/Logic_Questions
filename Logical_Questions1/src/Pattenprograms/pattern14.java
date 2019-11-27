package Pattenprograms;
import java.util.Scanner;
public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
			if( i==j || j==n-i+1)
			{
				System.out.printf("*");
			}
			else
			{
				System.out.printf("0");
			}
		}
       System.out.println();
	}

	}
}

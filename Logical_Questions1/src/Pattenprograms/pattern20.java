package Pattenprograms;
import java.util.Scanner;
public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char a='c',b='s',c='k';
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0)
				{
					System.out.print(a);
				}
				else if(i==n)
				{
					System.out.print(c);
					
				}
				else if(i==j||i+j==n-1)
				{
					System.out.print(b);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}

package Pattenprograms;
import java.util.Scanner;
public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1;k--)
			{
			System.out.print(k);
			}
			System.out.println();
		}
     
	}

}

package Pattenprograms;
import java.util.Scanner;
public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
     
	}

}

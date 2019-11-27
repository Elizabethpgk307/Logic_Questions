package Pattenprograms;
import java.util.Scanner;
public class patternalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.printf("%c",(char)i+64);
			}
			System.out.println();
		}

	}
}
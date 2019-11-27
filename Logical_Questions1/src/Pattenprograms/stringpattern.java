package Pattenprograms;
import java.util.Scanner;
public class stringpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				char c=str.charAt(j);
				System.out.print(c);
			}
			System.out.println();
		}

	}

}

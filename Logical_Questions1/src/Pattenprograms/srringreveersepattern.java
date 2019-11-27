package Pattenprograms;
import java.util.Scanner;
public class srringreveersepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.next();
		int length=str.length();
		int i,j;
		for(i=length-1;i>=0;i--)
		{
			for(j=i;j>=0;j--)
			{
				char c=str.charAt(j);
				System.out.print(c);
			}
			System.out.println();
		}
	}
	}


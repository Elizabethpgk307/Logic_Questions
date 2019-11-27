package Pattenprograms;
import java.util.Scanner;
public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n=s.next();
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i%3==0 || j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		

	}

}

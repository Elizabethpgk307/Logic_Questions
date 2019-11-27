package Pattenprograms;
import java.util.Scanner;
public class patternalphabet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=65;
		for(int i=0;i<=n;i++)
		{
		for(int j=0;j<i;j++)
		{
		System.out.printf("%c",s);
		s++;
		}
		System.out.println();
		}
		}
	}

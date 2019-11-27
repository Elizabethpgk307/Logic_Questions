package Pattenprograms;
import java.util.Scanner;
public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        for (int i=1; i<=n; i++) 
        {
        	int count=0;
        	for(int j=0;j<i*2;j++)
        	{
        		System.out.print("*");
        		count++;
        		if(count==i)
        		{
        			System.out.print(" ");
        			
        		}
        		
        	}
        	System.out.println();
        }

}
}
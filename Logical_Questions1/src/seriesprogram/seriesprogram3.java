package seriesprogram;
import java.util.Scanner;
public class seriesprogram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		float a=1,b=2,d,e;
		System.out.printf(a+" ");
		System.out.printf(b+" ");
		for(int i=3;i<=n;i++)
		{
			if(i%2==0)
			{
			    d=b*3;
				System.out.print(d+" ");
				b=d;
				
			}
			else
			{
			    e=a*3;
				System.out.print(e+" ");
				a=e;
				
			}
		}
		
		

	}

}

package seriesprogram;
import java.util.Scanner;
public class seriesprograms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				int d=i*i;
				int e=d-1;
				System.out.print(e+" ");
			}
			else
			{
				int d1=i*i;
				int e1=d1-2;
				System.out.print(e1+" ");
			}
			}
		}

	}



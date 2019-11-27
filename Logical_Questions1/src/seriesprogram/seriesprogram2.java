package seriesprogram;
import java.util.Scanner;
public class seriesprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=11;
		int b=4;
		for(int i=0;i<n;i++)
		{
			int c=a+b*i;
			int sq=(int) Math.pow(c, 2);
			System.out.print(sq+" ");
			
		}

	}

}

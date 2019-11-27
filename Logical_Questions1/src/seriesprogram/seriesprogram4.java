package seriesprogram;
import java.util.Scanner;
public class seriesprogram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=4;

        System.out.print(a+" ");
		for(int i=1;i<n;i++)
		{
			int c=a+(i*i);
			System.out.print(c+" ");
			a=c;
		}

	}

}

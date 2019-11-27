package Logic_ques;
import java.util.Scanner;
public class nthfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int a[]=new int[n+1];
		a[0]=0;
		if(n>0)
		{
			a[1]=1;
		}
		for(int i=2;i<=n;i++)
		{
			a[i]=a[i-2]+a[i-1];
		}
		System.out.println(a[n]+" ");

	}

}

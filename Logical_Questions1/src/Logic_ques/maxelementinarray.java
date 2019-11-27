package Logic_ques;
import java.util.Scanner;
public class maxelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<n;i++)
			if(a[i]>max)
			{
				max=a[i];
			}
		System.out.println(max);

	}

}

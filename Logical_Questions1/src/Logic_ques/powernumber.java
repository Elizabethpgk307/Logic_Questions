package Logic_ques;
import java.util.Scanner;
public class powernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		System.out.println("Enter the power value:");
		int a=s.nextInt();
		int p=(int) Math.pow(n, a);
		System.out.println(p);

	}

}

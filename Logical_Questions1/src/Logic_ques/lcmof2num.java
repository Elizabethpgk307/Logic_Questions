package Logic_ques;
import java.util.Scanner;
public class lcmof2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int lcm;
		lcm=(n1>n2)?n1:n2;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.println(lcm);
				break;
			}
			lcm++;
		}

	}

}

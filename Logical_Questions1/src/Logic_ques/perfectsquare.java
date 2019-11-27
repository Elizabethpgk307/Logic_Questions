package Logic_ques;
	import java.util.Scanner;
	public class perfectsquare {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			double b=(int) Math.sqrt(n);
			if((b*b)==n) 
			{
				System.out.println("Perfect Square");
			}
			else
			{
				System.out.println("Not perfect square");
			}

		}

	}




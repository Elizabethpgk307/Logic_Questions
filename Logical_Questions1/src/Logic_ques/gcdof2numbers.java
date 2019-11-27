package Logic_ques;
import java.util.Scanner;
public class gcdof2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner s=new Scanner(System.in);
		int gcd=0;
		System.out.println("Enter the first number:");
		int n1=s.nextInt();
		System.out.println("Enter the second number:");
		int n2=s.nextInt();
		for(int i = 1; i <= n1 && i <= n2; i++)
        {
            if(n1%i==0 && n2%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", n1, n2, gcd);
    }
		

	}



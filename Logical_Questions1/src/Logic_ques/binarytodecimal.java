package Logic_ques;
import java.util.Scanner;
public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the binary number:");
		String bin=s.next();
		int dec=Integer.parseInt(bin,2);
		System.out.println(dec);
		

	}

}

package Logic_ques;
import java.util.Scanner;
public class binarytooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the binary number:");
		String number=s.next();
		int bnum = Integer.parseInt(number, 2);
		String ostr = Integer.toOctalString(bnum);
		System.out.println("Octal Value after conversion is: "+ostr);

	}

}

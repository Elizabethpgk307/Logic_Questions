package Logic_ques;
import java.util.Scanner;
public class decimaltooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal number:");
		int n=s.nextInt();
		int[] octalNum = new int[n]; 
		int i = 0; 
		while (n != 0)  
		{ 
		           octalNum[i] = n % 8; 
		           n = n / 8; 
		           i++; 
		       }  
		       for (int j = i - 1; j >= 0; j--) 
		           System.out.print(octalNum[j]); 
		   } 
		}

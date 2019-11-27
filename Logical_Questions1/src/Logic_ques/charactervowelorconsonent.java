package Logic_ques;
import java.util.Scanner;
public class charactervowelorconsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=s.next().charAt(0);
		if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("Consonant");
		}

	}

}

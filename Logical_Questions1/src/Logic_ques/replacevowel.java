package Logic_ques;
import java.util.*;
public class replacevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i=0;
		char c;
		int count=0;
		System.out.println("Enter the string:");
		String a=s.next();
		for(i=0;i<a.length();i++)
		{
			c=a.charAt(i);
			
			if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U'))
			{
				count++;
				System.out.print('$');
			}
			else
			{
				System.out.print(c);
			}
			
		}

	}

}

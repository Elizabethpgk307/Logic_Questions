package Logic_ques;
import java.util.Scanner;
public class wordlength {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
int i=0;
for(char c:str.toCharArray())
{
i++;
}
System.out.println("Legth:"+i);
}

}


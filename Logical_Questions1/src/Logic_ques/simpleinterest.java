package Logic_ques;
import java.util.Scanner;
public class simpleinterest {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Principal amount:");
int p=sc.nextInt();
System.out.println("Rate per annum:");
int n=sc.nextInt();
System.out.println("Time in year:");
int r=sc.nextInt();
double I=(p*n*r)/100;
System.out.println("simple interest: "+I);

}

}


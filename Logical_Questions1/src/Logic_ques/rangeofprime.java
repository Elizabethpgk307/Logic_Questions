package Logic_ques;
import java.util.Scanner;
public class rangeofprime {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the first range:");
int m=s.nextInt();
System.out.println("Enter the second range:");
int n=s.nextInt();
int count=0;
int i,j;
for( i=m;i<=n;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
{
count=0;
break;
}
else
{
count=1;
}
}
if(count==1)
{
System.out.println(i);
}
}

}
}





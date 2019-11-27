package Logic_ques;
import java.util.Scanner;
public class distinctelement {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j;
int arr[]=new int[n];
System.out.print("Enter elements:");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for( i=1;i<n;i++)
{
for( j=1;j<n;j++)
if(arr[i]==arr[j])
break;
if(i==j)
System.out.print(arr[i]+" ");
}
}
}





package Logic_ques;

import java.util.Scanner;
public class Circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    float r;
    double area, circum;
    System.out.print("Enter Radius of Circle : ");
    r = s.nextFloat();
    circum = 2*3.14*r;
	 System.out.print("\nCircumference of Circle = " +circum);
	}

}


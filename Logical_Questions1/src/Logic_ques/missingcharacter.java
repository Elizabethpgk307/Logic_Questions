package Logic_ques;
import java.util.Scanner;
public class missingcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		        //10 is missing
		        int[] numbers = {1,2,3,4,5,6,7,8,9,11,12};
		        int N = 12;
		        int idealSum = (N * (N + 1)) / 2;
		        int sum = calculateSum(numbers);
		        int missingNumber = idealSum - sum;
		        System.out.println(missingNumber);
		    }
		    private static int calculateSum(int[] numbers) {
		        int sum = 0;
		        for (int n : numbers) {
		            sum += n;
		        }
		        return sum;
		    }
		}


import java.util.Scanner;
public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = input.nextInt();
		if (num % 2 == 0)
			System.out.println("Entered number is even ");
		else
			System.out.println("Enetered number is odd ");
		
		
		

	}

}

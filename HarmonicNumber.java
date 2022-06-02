package Sum;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=scanner.nextInt();
		double result=0.0;
		
		System.out.print("The harmonic series is :");
		
		
		while(num>0) {
			result = result + (double)1 / num;
			
			num--;
			System.out.print(result +" ");
			
		}
		
		System.out.println("The Harmonic Number given num :"+result);

	}

}

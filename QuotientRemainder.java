package Sum;
import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend,divisor,Quotient,Remainder;
		Scanner a= new Scanner(System.in);
		System.out.println("Enetr the dividend");
		dividend = a.nextInt();
		Scanner b= new Scanner(System.in);
		System.out.println("Enter the divisor");
		divisor = b.nextInt();
		
		Quotient=dividend/divisor;
		Remainder=dividend%divisor;
		
		System.out.println("Quotient= "+Quotient);
		System.out.println("Remainder= "+Remainder);
		

	}

}

import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Year");
		year=scan.nextInt();
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not leap Year");
		}
		

	}

}

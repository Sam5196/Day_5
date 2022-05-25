package Sum;
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the n1");
		n1=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the n2");
		n2=b.nextInt();
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the n3");
		n3=c.nextInt();
		
		if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
		
	}

}

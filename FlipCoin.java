package Sum;
import java.util.Scanner;
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int head=0,tails=0,count=1;
		double random=0.0;
		
		System.out.println("Enter the number : ");
		Scanner n = new Scanner(System.in);
		int flips =n.nextInt();
		
		while(count <= flips) {
			random=Math.random();
			System.out.println(count+""+random);
			
			if (random<0.5) {
				head++;
				System.out.println(" head ");
				
			}
			else {
				tails++;
				System.out.println(" tails ");
				
			}
			count++;
		}
		System.out.println();
		System.out.println(" Number of Head :" +head);
		System.out.println(" Number of Tails :" +tails);
		
		double headpercent = (double)head/flips*100;
		double tailpercent = (double)tails/flips*100;
		
		System.out.println("Percentage of Head :" +headpercent);
		System.out.println("Percentage of Tail :" +tailpercent);
		
		
	}

}

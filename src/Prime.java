import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		
		System.out.println("Please enter the number of prime number you want :");
		int Input = scanner.nextInt();
		
		for (int count = 2; (count <= 1000) && (total < Input); count++) {
			int max = 0;
			double upper = Math.ceil(count / 2);
			//System.out.println("I am upper : " + upper);
			for (int divide = 2; (divide <= upper) && (max == 0); divide++) {
				if ((count % divide) == 0) {
					max++;
				}
			}
			//System.out.println("Yo! I am max : " + max);
			if (max == 0) {
				System.out.println("Prime " + (total + 1.00) + " : " + count);
				total++;
			}
		}
		scanner.close();
	}
}
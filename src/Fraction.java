import java.util.Scanner;

public class Fraction {
	public static void main(String[] args) {
		int multi_f, multi_d, divide = 2;
		Scanner fraction = new Scanner(System.in);
		Scanner denominator = new Scanner(System.in);
		
		System.out.println("Please enter the first fraction :");
		int fraction_1 = fraction.nextInt();
		System.out.println("Please enter the second fraction :");
		int denominator_1 = denominator.nextInt();
		System.out.println("Please enter the first denominator :");
		int fraction_2 = fraction.nextInt();
		System.out.println("Please enter the second denominator :");
		int denominator_2 = denominator.nextInt();
		fraction.close();
		denominator.close();
		
		multi_f = fraction_1 * denominator_2 + fraction_2 * denominator_1;
		multi_d = denominator_1 * denominator_2;
		
		for (int count = 2; count <= (Math.min(multi_f, multi_d) + 1); count++) {
			System.out.println(multi_f + " " + multi_d);
			System.out.println(divide);
			if ((multi_f % divide == 0) && (multi_d % divide == 0)) {
				multi_f = multi_f / divide;
				multi_d = multi_d / divide;
				divide = 1;
			}
			divide++;
			if (count > Math.min(multi_f, multi_d)) {
				break;
			}
		}
		
		
		System.out.println("The simplest form is " + multi_f + "/" + multi_d + ".");
	}
}

import java.util.Scanner;
public class E {
  public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter E :");
		int x = scan.nextInt();
		double number = 1;
		double sum = 0;
		int n = 0;

		while (number > 1.0E-12){
			double factorial = 1;
			double numerator = 1;

			for (int i = n; i > 0; i--){
				factorial *= i;
				numerator *= x;
			}

			number = numerator / factorial;
			sum = sum + number;

			System.out.print("n: " + n + "\tnumber: " + number + "\tsum: " + sum + "\n");
			n = n +1;
		}
		System.out.println("My e^x: " + sum);
		System.out.println("real e^x: " + Math.exp(x));

	}
}
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator extends Exception {

	public static void main(String[] args) {

		try {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter Principal Amount ");
			int principalAmount = scanner.nextInt();

			System.out.println("Enter the Annual Interest Rate ");
			float annualInterestRate = scanner.nextFloat();

			float monthlyInterestRate = annualInterestRate / 100 / 12;

			System.out.println("No. of Years ");
			int years = scanner.nextInt();

			int noOfPayments = years * 12;

			double mortgageAmount = principalAmount
					* (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, noOfPayments))
					/ (Math.pow(1 + monthlyInterestRate, noOfPayments));

			// NumberFormat will be used to format the number
			// getCurrencyInstance is add $
			String mortgageString = NumberFormat.getCurrencyInstance().format(mortgageAmount);

			System.out.println("Mortgage Amount is " + mortgageString);
		} catch (Exception e) {
			System.out.println("Please Enter Numbers");
		}
	}

}

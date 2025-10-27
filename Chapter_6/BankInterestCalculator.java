import java.text.DecimalFormat;
import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0####");

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        for (double rate = 0.02; rate <= 0.05; rate += 0.01) {
            double currentBalance = balance;
            System.out.printf("%nWith an initial balance of $%s at an interest rate of %.2f%n",
                    df.format(balance), rate);

            for (int year = 1; year <= 4; year++) {
                currentBalance = currentBalance * (1 + rate);
                System.out.printf("After year %d balance is $%s%n",
                        year, df.format(currentBalance));
            }
        }

        input.close();
    }
}

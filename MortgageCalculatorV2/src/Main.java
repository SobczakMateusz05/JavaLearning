import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    private static final String PRINCIPAL_ENTER_LABEL = "Principal (1K - 1M): ";
    private static final String INTEREST_ENTER_LABEL = "Annual Interest Rate: ";
    private static final String PERIOD_ENTER_LABEL = "Period (Years): ";

    private static final String PRINCIPAL_ENTER_RANGE = "Enter a number between 1,000 and 1,000,000";
    private static final String INTEREST_ENTER_RANGE = "Enter a value greater than 0 and less than or equal to 30";
    private static final String PERIOD_ENTER_RANGE = "Enter a value between 1 and 30";

    private static final String MORTGAGE_DISPLAY_LABEL = "Mortgage: ";

    private static final byte PERCENT = 100;
    private static final byte MONTHS_IN_YEAR = 12;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main() {
        int principal = providePrincipal();
        double monthlyInterest = provideMonthlyInterest();
        int monthsPeriod = provideMonthsPeriod();

        double mortgage = CalculationUtils.calculateMonthlyPayment(principal, monthlyInterest, monthsPeriod);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        displayMortgage(formattedMortgage);

        scanner.close();
    }

    private static int providePrincipal() {
        int principal;

        while (true) {
            System.out.print(PRINCIPAL_ENTER_LABEL);
            principal = scanner.nextInt();

            if (principal >= 1_000 && principal <= 1_000_000) {
                return principal;
            }

            System.out.println(PRINCIPAL_ENTER_RANGE);
        }
    }

    private static double provideMonthlyInterest() {
       double annualInterest;

        while (true) {
            System.out.print(INTEREST_ENTER_LABEL);
            annualInterest = scanner.nextDouble();

            if (annualInterest > 0 && annualInterest <= 30) {
                return annualInterest / PERCENT / MONTHS_IN_YEAR;
            }

            System.out.println(INTEREST_ENTER_RANGE);
        }
    }

    private static int provideMonthsPeriod() {
        int yearsPeriod;

        while (true) {
            System.out.print(PERIOD_ENTER_LABEL);
            yearsPeriod = scanner.nextInt();

            if (yearsPeriod >= 1 && yearsPeriod <= 30) {
                return yearsPeriod * MONTHS_IN_YEAR;
            }


            System.out.println(PERIOD_ENTER_RANGE);
        }
    }

    private static void displayMortgage(String mortgage) {
        System.out.println(MORTGAGE_DISPLAY_LABEL + mortgage);
    }
}
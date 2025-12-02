import java.text.NumberFormat;
import java.util.Scanner;

class Main {
    private static final byte PERCENT = 100;
    private static final byte MONTHS_IN_YEAR = 12;
    private static final Scanner scanner = new Scanner(System.in);

    static void main() {
        int principal = providePrincipal();
        double monthlyInterest = provideMonthlyInterest();
        int monthsPeriod = provideMonthsPeriod();

        double mortgage = calculateMonthlyPayment(principal, monthlyInterest, monthsPeriod);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        displayMortgage(formattedMortgage);

        scanner.close();
    }

    private static double calculateMonthlyPayment(int principal, double monthlyInterest, int monthsPeriod) {
        return principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest), monthsPeriod)
                / (Math.pow((monthlyInterest + 1), monthsPeriod) - 1));
    }

    private static int providePrincipal() {
        int principal;

        while (true) {
            System.out.print("Principal (1K - 1M): ");
            principal = scanner.nextInt();

            if (principal >= 1_000 && principal <= 1_000_000)
                return principal;

            System.out.println("Enter a number between 1,000 and 1,000,000");
        }
    }

    private static double provideMonthlyInterest() {
       double annualInterest;

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextDouble();

            if (annualInterest > 0 && annualInterest <= 30)
                return annualInterest / PERCENT / MONTHS_IN_YEAR;

            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
    }

    private static int provideMonthsPeriod() {
        int yearsPeriod;

        while (true) {
            System.out.print("Period (Years): ");
            yearsPeriod = scanner.nextInt();

            if (yearsPeriod >= 1 && yearsPeriod <= 30)
                return yearsPeriod * MONTHS_IN_YEAR;


            System.out.println("Enter a value between 1 and 30");
        }
    }

    private static void displayMortgage(String mortgage) {
        System.out.println("Mortgage: " + mortgage);
    }
}
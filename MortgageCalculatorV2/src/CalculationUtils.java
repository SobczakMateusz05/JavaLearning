public class CalculationUtils {
    public static double calculateMonthlyPayment(int principal, double monthlyInterest, int monthsPeriod) {
        return principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest), monthsPeriod)
                / (Math.pow((monthlyInterest + 1), monthsPeriod) - 1));
    }
}

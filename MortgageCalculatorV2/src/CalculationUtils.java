public class CalculationUtils {
    public static double calculateMonthlyPayment(int principal, double monthlyInterest, int monthsPeriod) {
        double increasedMonthlyInterest = 1 + monthlyInterest;

        return principal
                * (monthlyInterest * Math.pow((increasedMonthlyInterest), monthsPeriod)
                / (Math.pow((increasedMonthlyInterest), monthsPeriod) - 1));
    }

    public static double calculatePrincipalAfterPayment(double principal, double monthlyInterest, int monthsPeriod, int numberOfPaymentsMade) {
        double increasedMonthlyInterest = 1 + monthlyInterest;

        principal = principal
                * (
                        (Math.pow((increasedMonthlyInterest), monthsPeriod) - Math.pow((increasedMonthlyInterest), numberOfPaymentsMade))
                        / (Math.pow((increasedMonthlyInterest), monthsPeriod) - 1)
                 );

        return principal;
    }
}

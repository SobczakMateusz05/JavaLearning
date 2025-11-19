 void main() {
         final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        int principal;
        double annualInterest;
        byte period;
        String mortgage;

        System.out.print("Principal: ");
        principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        annualInterest = scanner.nextDouble() / PERCENT;

        System.out.print("Period (Years): ");
        period = scanner.nextByte();

        mortgage = NumberFormat.getCurrencyInstance().format(calculateMonthlyPayment(principal, annualInterest, period));

        System.out.println("Mortgage: " + mortgage);
    }

    private static double calculateMonthlyPayment(int principal, double annualInterest, byte period) {
        final byte MONTHS_IN_YEAR = 12;

        double monthlyInterest = annualInterest / MONTHS_IN_YEAR;
        int monthsPeriod = period * MONTHS_IN_YEAR;

        return principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest), monthsPeriod)
                / (Math.pow((monthlyInterest + 1), monthsPeriod) - 1));
    }


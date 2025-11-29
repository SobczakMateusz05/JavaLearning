public class LogicalOperator {
    public static void isEligible(){
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println("hasHighIncome: " + hasHighIncome);
        System.out.println("hasGoodCredit: " + hasGoodCredit);
        System.out.println("hasCriminalRecord: " + hasCriminalRecord);
        System.out.println("isEligible: " +  isEligible);
    }
}

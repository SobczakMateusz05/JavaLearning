class Main {
    static void main() {
        displayBreak("Comparison Operator");
        ComparisonOperator.operators();

        displayBreak("Logical Operator");
        LogicalOperator.isEligible();

        IfStatement.displayEverything();

        displayBreak("Switch Statement");
        SwitchStatement.checkRole();

        Loops.displayEverything();
    }

    public static void displayBreak(String title){
        System.out.println("----------------");
        System.out.println(title + ":");
        System.out.println();
    }
}
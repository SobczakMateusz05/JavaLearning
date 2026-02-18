public class Main {
    public static void main(String[] args) {
        System.out.println("Employee:");

        var employee = new Employee(50_000, 25);
        int extraHours = 20;

        int wage = employee.calculateWage(extraHours);

        System.out.println(wage);
        Employee.printNumberOfEmployees();

        System.out.println("Browser:");

        var browser = new Browser();

        browser.navigate("https://www.google.com");
    }
}
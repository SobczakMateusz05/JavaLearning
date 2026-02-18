public class Employee {
    private int baseSalary;
    private int hourlyRate;

    private static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);

        numberOfEmployees++;
    }

    public Employee(int baseSalary) {
        this(baseSalary, 0); // Call constructor
    }

    public static void printNumberOfEmployees() {
        System.out.println("Number of employees: " + numberOfEmployees);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + extraHours * getHourlyRate();
    }

    public int calculateWage() {    // Overloading method
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than 0");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate must be greater than 0");
        }
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}

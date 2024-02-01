public class TaxCalculator {

    public static double calculateTax(double weeklyIncome) {
        double taxRate;

        if (weeklyIncome < 500) {
            taxRate = 0.10; // 10% tax rate
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15; // 15% tax rate
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20; // 20% tax rate
        } else {
            taxRate = 0.30; // 30% tax rate
        }

        return weeklyIncome * taxRate;
    }

    public static void main(String[] args) {
        double weeklyIncome = 1000; // Example weekly income
        double taxWithheld = calculateTax(weeklyIncome);

        System.out.println("Weekly Income: $" + weeklyIncome);
        System.out.println("Weekly Average Tax Withholding: $" + taxWithheld);
    }
}

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped < 5) ? 1 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
    double calculated = (1000 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
    return (calculated < 2000) ? calculated : 2000;
}

};
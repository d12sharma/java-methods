import java.util.Random;

public class EmployeeSalary {

    // Method to generate random salary and years of service
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000);
            employeeData[i][1] = 1 + random.nextInt(10);
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalary(double[][] employeeData) {
        double[][] salaryAndBonus = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = (yearsOfService >= 5) ? salary * 0.05 : salary * 0.02;

            salaryAndBonus[i][0] = salary + bonus;
            salaryAndBonus[i][1] = bonus;
        }
        return salaryAndBonus;
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        double[][] employeeData = generateEmployeeData(numEmployees);

        double[][] salaryAndBonus = calculateNewSalary(employeeData);

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Emp ID", "Old Salary", "Years of Service", "New Salary",
                "Bonus");

        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += employeeData[i][0];
            totalNewSalary += salaryAndBonus[i][0];
            totalBonus += salaryAndBonus[i][1];

            System.out.printf("%-10d %-15.2f %-15.0f %-15.2f %-15.2f%n",
                    i + 1, employeeData[i][0], employeeData[i][1],
                    salaryAndBonus[i][0], salaryAndBonus[i][1]);
        }
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n", "TOTAL", totalOldSalary, "", totalNewSalary,
                totalBonus);
    }
}
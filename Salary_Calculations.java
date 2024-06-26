class Salary_Calculations {
    private String name;
    private int employeeNumber;
    private double monthlyWage;
    private double taxRate;
    private double nationalInsuranceRate;

    public Salary_Calculations(String name, int employeeNumber, double monthlyWage, double taxRate, double nationalInsuranceRate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.monthlyWage = monthlyWage;
        this.taxRate = taxRate;
        this.nationalInsuranceRate = nationalInsuranceRate;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getMonthlyWage() {
        return monthlyWage;
    }

    public double getTax() {
        return monthlyWage * taxRate;
    }

    public double getNationalInsurance() {
        return monthlyWage * nationalInsuranceRate;
    }

    public double getNetPay() {
        return monthlyWage - getTax() - getNationalInsurance();
    }

    public double getGrossPay() {
        return monthlyWage;
    }

    public String generatePaySlip() {
        StringBuilder paySlip = new StringBuilder();
        paySlip.append("Employee Name: ").append(name).append("\n");
        paySlip.append("Employee Number: ").append(employeeNumber).append("\n");
        paySlip.append("Gross Pay: $").append(getGrossPay()).append("\n");
        paySlip.append("Tax Deduction: $").append(getTax()).append("\n");
        paySlip.append("National Insurance Deduction: $").append(getNationalInsurance()).append("\n");
        paySlip.append("Net Pay: $").append(getNetPay()).append("\n");
        return paySlip.toString();
    }
}
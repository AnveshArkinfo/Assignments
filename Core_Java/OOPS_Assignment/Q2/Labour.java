public class Labour extends Employee{
    public double salaryL, overTime;
    public Labour(double salaryL ,double overTime)
    {
        this.salaryL = salaryL;
        this.overTime = overTime;
    }
    @Override
    public void getTotalSalary() {
        System.out.println("Total Salary of Labour is :" +  totalLabSal());
    }
    public double totalLabSal() {
        double totallsal = salaryL +overTime;
        return totallsal;
    }
}
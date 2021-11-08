public class Manager extends Employee{
    public double msalary, incentive;
    public Manager(double msalary ,double incentive)
    {
        this.msalary = msalary;
        this.incentive = incentive;
    }
    
    @Override
    public void getTotalSalary() {
        System.out.println("Total salary of manager is : " + totalmSalary());
    }

    public double totalmSalary() {
        double totalmSalary = msalary +incentive;
        return totalmSalary;
    }
}
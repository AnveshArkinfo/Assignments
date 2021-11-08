public class Organization {

    public static void main(String[] args) {
    	
    	Manager m = new Manager(34000,2300);
    System.out.println("Manager Incentive = "+m.incentive);
     m.getTotalSalary();
    System.out.println();
    
    
        Labour lab = new Labour(16000,1800);
        System.out.println("Overtime incentive of Labour is :  "+lab.overTime);
        lab.getTotalSalary();
    System.out.println();
    
    
    double totalEmpSal = m.totalmSalary() + lab.totalLabSal();
    System.out.println("Total Salary of all Employees is : " + totalEmpSal);

    }
}

/* After Execution the output of the program should be

Manager Incentive = 2300.0
Total salary of manager is : 36300.0

Overtime incentive of Labour is :  1800.0
Total Salary of Labour is :17800.0

Total Salary of all Employees is : 54100.0

*/
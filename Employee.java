import java.util.Scanner;

public abstract class Employee {
    Scanner myInput=new Scanner(System.in);
    String employeeName, department;
    int employeeNumber;
    double salary, finalSalary;

    public Employee(){

    }

    public Employee(String employeeName, String department, int employeeNumber, double salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    void setData(){
        System.out.println("Enter Your Name: ");
        employeeName=myInput.nextLine();
        System.out.println("Enter Your Number: ");
        employeeNumber=myInput.nextInt();
        System.out.println("Enter Your Department: ");
        department=myInput.next();
        System.out.println("Enter Your Salary: ");
        salary=myInput.nextDouble();


    }

   double computeSalary(){
        finalSalary= (salary*0.9);
        return finalSalary;

    }

    void displayInformation(){
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Number: "+employeeNumber);
        System.out.println("Employee Department: "+department);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Final Salary: "+finalSalary);

    }


    abstract void setNextOfKin();

}

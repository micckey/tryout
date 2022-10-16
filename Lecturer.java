import java.util.Scanner;

public class Lecturer extends Employee{
    Scanner input=new Scanner(System.in);
    String educationLevel, nextofkin;
    int choice;

    void eduLevel(){
        System.out.println("Choose your education level: ");
        System.out.println("1.PhD  2.Masters");
        choice=input.nextInt();
        if(choice==1){
            educationLevel="PhD";
        }
        else {
            educationLevel="Masters";
        }
    }

    double computeSalary(){
        finalSalary= (salary*0.7);
        return finalSalary;

    }

    @Override
    void setNextOfKin() {
        System.out.println("Enter Next of Kin: ");
        nextofkin=input.nextLine();
    }

    void displayInformation(){
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Number: "+employeeNumber);
        System.out.println("Employee Next of Kin: "+nextofkin);
        System.out.println("Education Level: "+educationLevel);
        System.out.println("Employee Department: "+department);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Final Salary: "+finalSalary);

    }

}

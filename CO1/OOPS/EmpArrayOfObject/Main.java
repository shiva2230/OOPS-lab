package OOPS.EmpArrayOfObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int eno = 0;
        String ename;
        float salary;
        Scanner sc = new Scanner(System.in);
        Employee emp=new Employee();
        System.out.println("Enter how many details of employee you want to add");
        n=sc.nextInt();
        Employee[] employee=new Employee[n];

        System.out.println("Enter the employee details");
        for (int i=0;i<n;i++){
            System.out.println("Employee Name: ");
            ename=sc.next();
            System.out.println("Employee No: ");
            eno=sc.nextInt();
            System.out.println("Employee Salary: ");
            salary=sc.nextInt();
            employee[i]=new Employee(eno,n,ename,salary);

        }
        emp.search(eno,employee,n);
        emp.display(employee);




    }
}


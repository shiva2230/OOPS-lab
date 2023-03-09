package OOPS.EmpArrayOfObject;

import java.util.Scanner;

public class Employee {

    int eNo;
    int n;
    String eName;
    float salary;

    public Employee(int eNo, int n, String eName, float salary) {
        this.eNo = eNo;
        this.n = n;
        this.eName = eName;
        this.salary = salary;
    }

//    void addData(int eNo, String eName, float salary){
//        this.eNo=eNo;
//        this.eName=eName;
//        this.salary=salary;
//    }


    public Employee() {
    }

    void search(int eNo, Employee[] employee, int n){
        this.eNo=eNo;
        int flag=0;
        String count = null;
        this.n=n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id to search: ");
        eNo=sc.nextInt();

        for (int i=0;i<n;i++){
            
            if(eNo==employee[i].eNo){
                count=employee[i].eName;
                flag=1;
                break;
            }

        }
        if(flag==1){
            System.out.println("Employee with employee number "+eNo+" is "+count);

        }
        else {
            System.out.println("Item not found");
        }

    }

    void display(Employee[] employee){

        for (int i=0;i<n;i++){
            System.out.println("-----------------------------------");
            System.out.println("Employee name:  "+employee[i].eName);
            System.out.println("Employee number: "+"Rs "+employee[i].eNo);
            System.out.println("Employee salary "+employee[i].salary);
            System.out.println("-------------------------");

        }

    }




}

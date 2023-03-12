package OOPS.StringManipulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc= new Scanner(System.in);
        StringFun string=new StringFun();
        do {
            System.out.println("Choose which string function to perform:");
            System.out.println("1. Change all characters to uppercase \n2. Change all characters to lowercase \n3. Replace word \n4. Find the length \n5. Join word \n0. Exit ");
            choice=sc.nextInt();


            switch (choice){
                case 1:
                    string.uppercase();
                    break;
                case 2:
                    string.lowercase();
                    break;
                case 3:
                    string.replace();
                    break;
                case 4:
                    string.findLength();
                    break;
                case 5:
                    string.joinWord();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice !!");

            }
        }while (choice!=0);
    }
}

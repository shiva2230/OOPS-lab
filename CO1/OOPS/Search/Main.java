package OOPS.Search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr= new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add");
        int num=sc.nextInt();
        System.out.println("Enter the list of numbers");
        for (int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the item you want to search");
        int item=sc.nextInt();
        Search search= new Search();
        search.search(arr,item,num);
    }
}
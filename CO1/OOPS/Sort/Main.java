package OOPS.Sort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
//        String newStr;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many words you want to input: ");
        n=sc.nextInt();
        String[] str= new String[n];
        System.out.println("Enter the words: ");
        for (int i=0;i<n;i++){
            str[i]=sc.next();
        }
        Sort sort=new Sort();
        sort.wordSort(str);
    }

}

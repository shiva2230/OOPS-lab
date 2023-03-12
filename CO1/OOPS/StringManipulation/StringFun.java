package OOPS.StringManipulation;

import java.util.Scanner;

public class StringFun {
    Scanner sc=new Scanner(System.in);
    String str,strJoin;
    String repl;
    String replWith;
    void uppercase(){
        System.out.println("Enter the word:");
        str=sc.next();
        System.out.println("Word after conversion to uppercase: "+str.toUpperCase());
    }

    void lowercase(){
        System.out.println("Enter the word:");
        str=sc.next();
        System.out.println("Word after conversion to lowercase: "+str.toLowerCase());
    }

    void replace() {

        System.out.println("Enter the words: ");
        str = sc.nextLine();
        System.out.println("Enter which word you want to replace");
        repl = sc.nextLine();
        System.out.println("Enter which word you want to replace with");
        replWith = sc.nextLine();
        System.out.println("After replacing: "+ str.replaceAll(repl,replWith));
    }

    void findLength(){
        System.out.println("Enter the word to find the length: ");
        str=sc.nextLine();
        System.out.println("Length of the word: "+str.length());
    }

    void joinWord(){
        System.out.println("Enter the word : ");
        str=sc.nextLine();
        System.out.println("Enter the word to join it with: ");
        strJoin=sc.nextLine();
        System.out.println("Word after joining: "+ String.join(" ",str,strJoin));
    }
}

package OOPS.Search;

import java.util.Scanner;

public class Search {
    int flag=0,count=0;
    void search(int[] arr,int item,int num){
        for (int i=0;i<=num;i++){
            count++;
            if(arr[i]==item)
            {
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Item found at "+count+" position");

        }
        else {
            System.out.println("Item not found");
        }

    }

}


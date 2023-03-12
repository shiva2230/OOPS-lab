package OOPS.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {

    void wordSort(String[] word){
        System.out.println("Array before sorting: "+Arrays.toString(word));
        Arrays.sort(word);
        System.out.println("Array after sorting: "+Arrays.toString(word));
    }

}

package module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortMinMax {

    public static void main(String[] args) {
        Integer array[] = {2,5,6,7,8,1,2,0,3};

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        Collections.sort(arrayList);

        System.out.println("The minimal number is: " + Collections.min(arrayList));
        System.out.println("The maximal number is: " + Collections.max(arrayList));
    }
}

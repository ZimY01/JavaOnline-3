package module5;

import java.util.Arrays;

public class SortMinMax {

    public static void main(String[] args) {
        int array[] = {2,5,6,7,8,1,2,0,3};

        Arrays.sort(array);

        System.out.println("The minimal number is: " + array[0]);
        System.out.println("The maximal number is: " + array[array.length - 1]);
    }
}

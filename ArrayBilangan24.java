import java.util.Arrays;
import java.util.Scanner;

public class ArrayBilangan24 {
    public static void main(String[] args) {
        
        int[] bil = {5, 13, -7, 17};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }
        System.out.println(Arrays.toString(bil));

    }    
}
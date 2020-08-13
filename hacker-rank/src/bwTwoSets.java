import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

public class bwTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int lcm_arr = a.get(0);
        for(int i = 1; i < a.size(); i++){
            lcm_arr = lcm(lcm_arr, a.get(i));
        }

        /* Find GCD for the arrayList b */
        int gcd_arr = b.get(0);
        for(int i = 1; i < b.size(); i++){
            gcd_arr = gcd(gcd_arr, b.get(i));
        }

        /* Count the number of multiples of the LCM, which are factors of the GCD. */
        int count = 0;
        for(int i = lcm_arr, j = 1; i <= gcd_arr; i = j * lcm_arr){
            if(gcd_arr % i == 0)
                count++;
            j++;
        }
        return count;
    }

    static int gcd(int a, int b){
        if(a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }




}


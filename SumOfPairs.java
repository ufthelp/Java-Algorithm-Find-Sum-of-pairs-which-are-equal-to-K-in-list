import java.util.HashMap;
import java.util.Map;

/**
 * uftHelp
 * Code to fetch sum of 2 elements = k from the given list
 * Taken input integar array, and k value
 */
public class SumOfPairs {

    public static void main(String[] args) {
        //Input list
        int []amazon = {1,2,3,8,4,6};
        printSumPairs(amazon,7);

    }
//Print the sum of paris which is equal to k

    public static void printSumPairs(int []input, int k){
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for(int i=0;i<input.length;i++){

            if(pairs.containsKey(input[i]))
                System.out.println(input[i] +", "+ pairs.get(input[i]));
            else
                //This is the main logic where the trick happens
                pairs.put(k-input[i], input[i]);
        }

    }
}


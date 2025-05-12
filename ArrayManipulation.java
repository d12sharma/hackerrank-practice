import java.util.List;

public class ArrayManipulation
{
    class Result {

        /*
         * Complete the 'arrayManipulation' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. 2D_INTEGER_ARRAY queries
         */

        public static long arrayManipulation(int n, List<List<Integer>> queries) {
            // Write your code here
            long [] list = new long[n+1];

            for(int i=0 ; i<queries.size() ; i++){
                List<Integer> arr = queries.get(i);
                int start = arr.get(0)-1;
                int end = arr.get(1)-1;
                long update = arr.get(2);

                list[start] += update;
                list[end+1] -= update;
            }

            for(int i=1 ; i<n ; i++){
                list[i] = list[i] + list[i-1];
            }

            long maxValue = Integer.MIN_VALUE;

            for(int i=0 ; i<list.length ; i++){
                maxValue = Math.max(maxValue, list[i]);
            }

            return maxValue;
        }


    }
}

import java.util.ArrayList;
import java.util.List;

public class LeftRotated {
    class Result {

        /*
         * Complete the 'rotateLeft' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER d
         *  2. INTEGER_ARRAY arr
         */

        public static List<Integer> rotateLeft(int d, List<Integer> arr) {

            int n =arr.size();
            List<Integer> rotated = new ArrayList<>(n);

            int mod = d%n;
            for(int i=mod;i<n;i++){
                rotated.add(arr.get(i));
            }
            for(int i=0;i<mod;i++){
                rotated.add(arr.get(i));
            }
            return rotated;
        }
    }

}

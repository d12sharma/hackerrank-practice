import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    class Result {

        /*
         * Complete the 'twoStrings' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. STRING s1
         *  2. STRING s2
         */

        public static String twoStrings(String s1, String s2) {
            // Write your code here
            Set<Character> set1 = new HashSet<>();

            for(char c : s1.toCharArray()){
                set1.add(c);
            }
            for(char c : s2.toCharArray()){
                if(set1.contains(c)){
                    return "YES";
                }
            }
            return "NO";
        }
    }
}

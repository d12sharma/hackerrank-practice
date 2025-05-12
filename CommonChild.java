public class CommonChild {
    class Result {

        /*
         * Complete the 'commonChild' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. STRING s1
         *  2. STRING s2
         */

        public static int commonChild(String s1, String s2) {
            // Write your code here
            int[] prev = new int[s2.length() + 1];
            int[] curr = new int[s2.length() + 1];

            for (int i = 1; i <= s1.length(); i++) {
                for (int j = 1; j <= s2.length(); j++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        curr[j] = prev[j - 1] + 1;
                    } else {
                        curr[j] = Math.max(prev[j], curr[j - 1]);
                    }
                }

                int[] temp = prev;
                prev = curr;
                curr = temp;
            }

            return prev[s2.length()];


        }

    }
}

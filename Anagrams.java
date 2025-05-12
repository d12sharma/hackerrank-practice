public class Anagrams {
    class Result {

        /*
         * Complete the 'makingAnagrams' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. STRING s1
         *  2. STRING s2
         */

        public static int makingAnagrams(String s1, String s2) {
            // Write your code here
            int [] freq = new int [26];
            int sum =0;
            for(int i=0;i<s1.length();i++){
                char c = s1.charAt(i);
                freq[c-'a']++;
            }
            for(int i=0;i<s2.length();i++){
                char c =s2.charAt(i);
                freq[c-'a']--;
            }
            for(Integer i : freq){
                sum+= Math.abs(i);
            }
            return sum;


        }

    }
}

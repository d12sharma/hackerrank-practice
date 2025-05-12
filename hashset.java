import java.util.HashSet;
import java.util.Scanner;

public class hashset {
    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner sc = new Scanner(System.in);

            int t =sc.nextInt();
            sc.nextLine();


            HashSet<String> set1 = new HashSet<>();

            for(int i=0;i<t;i++){
                String s = sc.nextLine();


                set1.add(s);
                System.out.println(set1.size());

            }
        }
    }
}

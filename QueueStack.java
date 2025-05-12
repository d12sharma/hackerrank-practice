public class QueueStack {
    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            String s =sc.next();
            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();

            for( char c : s.toCharArray()){
                stack.push(c);
                queue.add(c);
            }
            for(int i=0;i<s.length();i++){}
            if(stack.pop()!=queue.poll()){
                System.out.println("The word, "+s+", is not a palindrome.");
            }
            else{
                System.out.println("The word, "+s+", is a palindrome.");
            }

        }
    }
}

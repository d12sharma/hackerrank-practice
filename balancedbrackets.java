import java.util.Stack;

public class balancedbrackets {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }


                if (c == '}' && stack.peek() == '{') {
                    stack.pop();

                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return "NO";
                }
            }
        }
    }
}gi

public class LargestRectangle {
    class Result {

        /*
         * Complete the 'largestRectangle' function below.
         *
         * The function is expected to return a LONG_INTEGER.+
         * The function accepts INTEGER_ARRAY h as parameter.
         */

        public static long largestRectangle(List<Integer> h) {
            // Write your code here
            Stack<Integer> stack = new Stack<>();
            long maxArea = 0;
            int i=0;
            int n=h.size();
            while(i<n){
                if(stack.isEmpty() || h.get(i) >= h.get(stack.peek()) ){
                    stack.push(i);
                    i++;
                }
                else{
                    int top=stack.pop();
                    int height = h.get(top);
                    int width = stack.isEmpty() ? i : i - stack.peek() -1;
                    maxArea = Math.max(height*width,maxArea);
                }

            }
            while(!stack.isEmpty()){
                int top=stack.pop();
                int height = h.get(top);
                int width = stack.isEmpty() ? i : i - stack.peek() -1;
                maxArea = Math.max(maxArea,height*width);
            }
            return maxArea;
        }

    }
}

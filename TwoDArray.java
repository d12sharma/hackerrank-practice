import java.util.List;

public class TwoDArray {
    class Result {

        /*
         * Complete the 'hourglassSum' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int hourglassSum(List<List<Integer>> arr) {

            int sum =Integer.MIN_VALUE;
            for(int i=0;i<=3;i++){
                for(int j=0;j<=3;j++){
                    int tempSum =arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                    if(tempSum > sum){
                        sum=tempSum;
                    }
                }

            }


            return sum;
        }

    }

}

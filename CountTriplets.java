import java.util.*;

public class CountTriplets {
    public class Solution {

        // Complete the countTriplets function below.
        static long countTriplets(List<Long> arr, long r) {

            // int count=0;
            // for(int i=0;i<arr.size()-2;i++){
            //     for(int j=i+1;j<arr.size()-1;j++){
            //         for(int k=j+1;k<arr.size();k++){
            //             if(arr.get(k)/ arr.get(j)== r && arr.get(j)/arr.get(i)== r){
            //                 count++;
            //             }
            //         }
            //     }
            // }
            // return count;

            Map<Long, Long> rightMap = new HashMap<>();
            Map<Long, Long> leftMap = new HashMap<>();

            long count = 0;

            for (long val : arr) {
                rightMap.put(val, rightMap.getOrDefault(val, 0L) + 1);

            }
            for (long mid : arr) {
                long left = 0;
                long right = 0;
                rightMap.put(mid, rightMap.get(mid) - 1);

                if (mid % r == 0) {
                    left = leftMap.getOrDefault(mid / r, 0L);
                }
                right = rightMap.getOrDefault(mid * r, 0L);
                count += left * right;

                leftMap.put(mid, leftMap.getOrDefault(mid, 0L) + 1);
            }
            return count;
        }

    }
}

// https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }
    static int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;

        for (int i = 0; i < nums.length; i++) {
            s = Math.max(s, nums[i]);
            e += nums[i];
        }

        // Binary Search
        while(s < e){
            int m = s + (e - s) / 2;
            
            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > m){
                    // It means its exceeding the maximum sum allowed in a subarray(i,e. mid/m)
                    // So make a new subarray, then sum = num;
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces > k){
                s = m + 1;
            } else{
                e = m;
            }
        }
        return s;    // Return s or e, coz (s == e) now.
    }
}

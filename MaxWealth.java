// https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 5},
            {7, 3},
            {3, 5}
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < arr.length; person++) {
            // When you start a new column, take new sum for that row
            int sum = 0;
            for (int account = 0; account < arr[person].length; account++) {
                sum += arr[person][account];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans; 
    }
}

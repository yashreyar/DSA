// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,4,7,7,9};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    static int[] searchRange(int[] arr, int target) {
        int[] ans = new int[2];
        int first = search(arr, target, true);
        int second = search(arr, target, false);
        ans[0] = first;
        ans[1] = second;
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int m = s + (e - s) / 2;
            if (target > arr[m]){
                s = m + 1;
            } else if (target < arr[m]){
                e = m - 1;
            } else {
                // Potential ans found
                ans = m;
                if(findStartIndex){
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }
}
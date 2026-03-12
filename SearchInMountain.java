// https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountain {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,1};
        int target = 1;
        System.out.println(findInMountainArray(arr, target));
    }

    static int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        if(BS(arr, target, 0, peak) != -1){
            return BS(arr, target, 0, peak);
        }
        return BS(arr, target, peak, arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while (s < e){
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m+1]){
                // you're in decreasing part of array
                // this may be ans, but look at the left
                e = m;
            } else {
                s = m+1;
            }
        }
        // in the end, start == end == largest number in the array
        return s;
    }

    static int BS(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            } 
            
            if(isAsc){
                if (target > arr[mid]){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            } 
            else {
                if (target < arr[mid]){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}


// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        int target = 2;
        System.out.println(findPivotWithDuplicates(arr));
        System.out.println(search(arr, target));
    }
    static int search(int[] nums, int target) { 
        int pivot = findPivotWithDuplicates(nums);
        if(pivot == -1){
            BS(nums, target, 0, nums.length-1);
        }
        if (BS(nums, target, 0, pivot) != -1){
            return BS(nums, target, 0, pivot);
        }
        return BS(nums, target, pivot+1, nums.length-1);
    }

    // It doesn't work wiith array of duplicate values
    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            int m = s + (e - s) / 2;
            if (m < e && arr[m] > arr[m+1]){
                return m;
            } 
            if (m > s && arr[m] < arr[m-1]){
                return m - 1;
            }
            if (arr[m] <= arr[s]){
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            int m = s + (e - s) / 2;
            if (m < e && arr[m] > arr[m+1]){
                return m;
            } 
            if (m > s && arr[m] < arr[m-1]){
                return m - 1;
            }
            // Till here its same code
            // If elements at start, mid and end are equal, just skip the duplicates
            if(arr[s] == arr[m] && arr[m] == arr[e]){
                // What if the element at start or end is pivot
                // Check for it
                if(arr[s] > arr[s+1]){
                    return s;
                }
                s = s+1;
                if(arr[e] < arr[e-1]){
                    return e-1;
                }
                e = e-1;
            }
            // Left side is sorted, so pivot should be in right 
            else if (arr[s] < arr[m] || (arr[s] == arr[m] && arr[m] > arr[e])) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }

    static int BS(int[] arr, int target, int start, int end){
        int s = start;
        int e = end;

        while(s <= e){
            int m = s + (e - s) / 2;
            if(target > arr[m]){
                s = m+1;
            } else if (target < arr[m]){
                e = m-1;
            } else{
                return m;
            }
        }
        return -1;
    }
}

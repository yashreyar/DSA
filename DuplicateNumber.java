// https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // Return the duplicate element
        return arr[arr.length-1];
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 9, 8};
        int ans = linear(arr, 6);
        System.out.println(ans);
    }
    static int linear(int[] arr, int target){
        // Search in the array : return index if item found
        // Return -1 if not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

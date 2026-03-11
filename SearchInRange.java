public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 3, 8};
        System.out.println(linearsearch(arr, 0, 3, 4));
    }
    static int linearsearch(int[] arr, int start, int end, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}

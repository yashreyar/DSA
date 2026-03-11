public class MaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5},
            {67,8,9},
            {10}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > ans){
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }
}

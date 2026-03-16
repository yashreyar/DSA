// Searching in a row-wise and column wise sorted array

import java.util.Arrays;
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {27,37,47,57},
            {29,39,49,59}
        };
        int target = 45;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;

        while(r < arr.length && c >= 0){
            if (target == arr[r][c]){
                return new int[]{r,c};
            }
            if (target < arr[r][c]){
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}

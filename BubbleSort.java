import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0,-12,43,85,-54,27};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                swapped = true;
                }
            }
            // If you did not swap for a particular value of i, it means the array is sorted hence stop the loop
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

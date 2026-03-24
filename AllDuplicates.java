// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }
    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // Add all the duplicate values to the list
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                list.add(arr[index]);
            }
        }
        return list;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

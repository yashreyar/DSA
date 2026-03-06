// QUE : Take input of 3 numbers and print the largest number among them.

import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if(b > max){
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("Maximum number is: "+max);
    }
}

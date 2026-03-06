import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        // Print numbers from 1 to n 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}

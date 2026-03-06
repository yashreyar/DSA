// QUE: To find whether input character is Uppercase or Lowercase

import java.util.Scanner;

public class UpperOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase character");
        } else {
            System.out.println("UpperCase character");
        }
    }
}

import java.util.Scanner;

public class IfElseLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        long salary = sc.nextLong();
        if(salary > 50000){
            salary = salary + 5000;
        } else {
            salary = salary + 3000;
        }
        System.out.println("Salary to be granted with bonus included: " + salary);
    }
}

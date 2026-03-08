import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2,34,2,12,34,54,76,43,76,87);
        fun("Yash");
    }
    static void fun(int ...v){
        System.out.println("First one");
        System.out.println(Arrays.toString(v));
    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}

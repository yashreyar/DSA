public class ReverseString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String name = "yash";
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
        }
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}

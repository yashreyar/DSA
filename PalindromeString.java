public class PalindromeString {
    public static void main(String[] args) {
        String name = null;
        System.out.println(isPalindrome(name));
    }

    static boolean isPalindrome(String name) {
        if(name == null || name.length() == 0){
            return true;
        }
        int start = 0;
        int end = name.length() - 1;
        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

                    // OR

    static boolean isPalindrome2(String name) {
        StringBuilder builder = new StringBuilder(name);
        builder.reverse();
        return builder.toString().equals(name);
    }
}

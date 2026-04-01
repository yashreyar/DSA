public class Stringbuilder{
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.charAt(5));
        builder.delete(2, 5);
        System.out.println(builder);
        System.out.println(builder.indexOf("l"));
    }
}
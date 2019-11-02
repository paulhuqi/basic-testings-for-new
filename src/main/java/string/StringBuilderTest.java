package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String b = null;
        sb.append("aa").append(b);
        System.out.println(sb.toString());
    }
}

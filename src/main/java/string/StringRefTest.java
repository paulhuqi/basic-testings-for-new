package string;

public class StringRefTest {
    public static void main(String[] args) {
        String a = "old";
        stringUpdate(a);
        System.out.println(a);
        StringBuilder sb = new StringBuilder("old2");
        stringUpdate(sb);
        System.out.println(sb);
    }
    
    private static void stringUpdate(String to) {
        to = "new";
    }
    private static void stringUpdate(StringBuilder to) {
//        to.setLength(0);
//        to.append("new");
        to.replace(0, to.length(), "new");
    }
}

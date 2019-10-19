package string;

public class StringSplit {
    public static void main(String[] args) {
        String test = "a&b&c";
        String test2 = "a=b=c";
        System.out.println(test.split("&")[1]);
        System.out.println(test2.split("=")[1]);
    }
}

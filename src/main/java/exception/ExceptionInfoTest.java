package exception;

public class ExceptionInfoTest {
    public static void main(String[] args) {
        String s = null;
        try {
            s.equals("");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}

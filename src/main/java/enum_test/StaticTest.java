package enum_test;

public enum StaticTest {
    a(1), b(2);
    public static final int l = StaticTest.values().length;
    StaticTest(int i) {
    
    }
    
    public static void main(String[] args) {
        System.out.println("length:"+ StaticTest.l);
    }
}

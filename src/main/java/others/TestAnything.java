package others;

public class TestAnything {
    public static void main(String[] args) {
//        () -> InterfaceFunction::print;
        debugOnCondition();
    }
    
    private static void debugOnCondition() {
        for (int i=0; i<14; i++) {
            System.out.println("i="+i);
        }
    }
}

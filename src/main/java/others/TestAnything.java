package others;

public class TestAnything {
    public static void main(String[] args) {
//        () -> InterfaceFunction::print;
        String s = "ab:cd";
//        s = s.replace(":", "-").toUpperCase();
        System.out.println(s = s.replace(":", "-").toUpperCase());
        System.out.println(s);
    }
    
    private static void debugOnCondition() {
        for (int i=0; i<14; i++) {
            System.out.println("i="+i);
        }
    }
}

package object;

public class TestStaticClass {

    public TestStaticClass(){
        System.out.println("外部类的构造方法");
    }

//    private static String staticParam =
    
    static {
        System.out.println("外部类的静态代码块");
    }

    {
        System.out.println("外部类的普通代码块");
    }

    public void outMethon(){
        System.out.println("外部类的普通方法，这时候还没看到内部类有任何输出");
        InnerCommonClass innerCommonClass=new InnerCommonClass();
        innerCommonClass.innerMethord();
        InnerStaticClass innerStaticClass=new InnerStaticClass();
        innerStaticClass.innerMethord();
    }

    public class InnerCommonClass{
        int a=10;
        {
            System.out.println("普通内部类的普通代码块----a="+a);
        }
        InnerCommonClass(){
            System.out.println("普通内部类的构造方法----a="+a);
            a=0;
        }

        public void innerMethord(){
            System.out.println("普通内部类-----a="+a);
        }

    }


    public static class InnerStaticClass{
        int a=10;
        static {
            System.out.println("静态内部类的静态代码块");
        }

        InnerStaticClass(){
            System.out.println("静态内部类的构造方法a="+a);
        }

        public static void innerStaticMethord(){
            System.out.println("静态内部类的静态方法");
        }

        public void innerMethord(){
            System.out.println("静态内部类的普通方法a="+a);
        }

    }

    public static void main(String[] str){
        System.out.println("主函数执行 new TestStaticClass()");
        TestStaticClass test=new TestStaticClass();
        test.outMethon();
    }

}
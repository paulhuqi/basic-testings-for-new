package algorism.recursion;

public class Sum {
    
    public static void main(String[] args) {
        int n = 100;
        System.out.println("1+...+" + n + " = " + sumIter(100));
    }
    // f(n)=f(n-1)+n
    // f(1)=1 递归
    // n=2 1+1 = 2
    // n=3
    private static int sum(int n) {
        if (n == 1) return 1;
        return sum(n-1) + n;
    }
    
    private static int sumIter(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

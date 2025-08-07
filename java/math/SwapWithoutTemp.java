public class SwapWithoutTemp {
    public static void main(String[] args) {
        
        int a=10;
        int b=9;
        a=a+b;
        b=a-b;
        a=a-b;
        System.err.println(a);
        System.err.println(b);

    }
    
}

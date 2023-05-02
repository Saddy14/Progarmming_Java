public class Test2 {
    public static void main(String[] args) {
        
        int x = 5;
        // burp(x);
        System.out.println(burp(x));
        // Test3.DingDong();
    }
    
    private static int burp(int x) {
        x = x + 5;
        // System.out.println("Pewpew");
        return x;
    }
}

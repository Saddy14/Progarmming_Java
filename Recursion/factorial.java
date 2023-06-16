public class factorial {
    public static void main(String[] args) {
        
        int num = 5;

        long ans = fac(num);
        
        System.out.println("Factorial of " + num +" is: "+ans );
    }

    static long fac(int x) {

        if (x == 1) {
            return 1;
        }

        return x * fac(x - 1);
    }
}
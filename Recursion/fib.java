public class fib {
    public static void main(String[] args) {
        // fibonaci numbers 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        int num = 4;
       
        System.out.println(fibonaci(num));
    }

    static int fibonaci(int num) {

        if (num <= 1) {
            return num;
        }

        return fibonaci(num-1) + fibonaci(num-2);
    }
}

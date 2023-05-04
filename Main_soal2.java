public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) { 
            return n;
        } else { 
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("Nilai fibonacci ke" + n + "adalah : " + result);
    }
}

public class primary {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));  // true
        System.out.println(isPrime(24));  // false
    }
}
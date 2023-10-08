/*
 * Sieve of Eratosthenes algorithm is used in the following code.
 */

public class FindAllNumbersUptoNthTerm {
    public static void main(String[] args) {
        int limit = 100; // Change this to the desired limit to find prime numbers up to that limit
        boolean[] isPrime = sieveOfEratosthenes(limit);

        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (!(isPrime[i])) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        for (int p = 2; p * p <= n; p++) {
            if (!(isPrime[p])) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = true;
                }
            }
        }
        return isPrime;
    }
}

public class CountTrailingZerosInFactorial {
    static int countTrailingZerosInFactorial(int n) {
        int zeroCount = 0;
        // Divide n by 5 and add the quotient to zeroCount
        // Continue dividing n by 5 until n becomes less than 5
        while (n >= 5) {
            n = n / 5;
            zeroCount += n;
        }
        return zeroCount;
    }
    public static void main(String[] args) {
        int n = 55;
        int result = countTrailingZerosInFactorial(n);
        System.out.println("The number of trailing zeros is: " + result);
    }
}
/*
 * Concept: The total number of possible 5 in a factorial is the number of trailing zeros.
 * As each of the 5 pairs with a 2 forming a 10.
 * And any number multiplied 10 results a number with a trailizing 0.
 * For example; when you have 10!
 * what is total number of 5? Is it one? No, its two as 10=5*2
 * Answer: 3628800. Hence, it has two trailing zeros i.e. equal number of possible fives.
 * Here, n=55
 * possible fives:
 * 5
 * 5x2
 * 5x3
 * 5x4
 * 5x5
 * 5x6
 * 5x7
 * 5x8
 * 5x9
 * 5x10=5*5*2
 * 5x11
 * total fives=13 so number of trailing zeros = 13
 * so simply divide 55/5=11= we have 11 fives
 * further, 11/2=2= we have 2 fives
 * 11+2=13
 */

public class Combinatorics

{

    /** Precondition: n is between 1 and 12, inclusive.

     * Returns the factorial of n, as described in part (a).

     */

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else if (n > 1) {
            return n * factorial(n - 1);
        }
        return 0;
    }



    /** Precondition: n and r are between 1 and 12, inclusive.

     * Determines the number of ways r items can be selected

     * from n choices and prints the result, as described in part (b).

     */

    public static void numCombinations(int n, int r) {
        if (r > n) {
            System.out.println("There are 0 ways of choosing " + r + " items from " + n + " choices.");
        }
        else if (r == n) {
            System.out.println("There is 1 way of choosing " + r + " items from " + n + " choices.");
        }
        else {
            int combins = factorial(n) / (factorial(r) * factorial(n - r));
            System.out.println("There are " + combins + " ways of choosing " + r + " items from " + n + " choices.");
        }
    }

}
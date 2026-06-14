// to print prime
package NEW;
class Arr15 {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Loop through each number in the array
        for (int i = 0; i < ar1.length; i++) {
        	 // Check if the number is prime
            if (isPrime(ar1[i])) {
            	 // If it is prime, print it
                System.out.println("Prime number is: " + ar1[i]);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
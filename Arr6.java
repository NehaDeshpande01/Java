// to find second largest num
package NEW;
public class Arr6{
    public static void main(String[] args) {
        int[] arr = {40, 50, 10, 60, 30, 20, 80};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}
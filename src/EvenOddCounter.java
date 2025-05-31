public class EvenOddCounter {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 10, 3, 11};
        int even = 0, odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}

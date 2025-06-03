public class UniqueXORPattern {

    // Function to calculate sum of digits
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to find the index of the first element satisfying the condition
    public static int findElementWithUniqueXOR(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int xorValue = arr[i] ^ k;
            int sumOfDigits = digitSum(arr[i]);

            if (xorValue == sumOfDigits) {
                return i; // return the index
            }
        }
        return -1; // if not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 12, 23, 10};
        int k = 2;

        int resultIndex = findElementWithUniqueXOR(arr, k);
        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("No such element found.");
        }
    }
}

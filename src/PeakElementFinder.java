public class PeakElementFinder {

    public static int findPeak(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak must be in right half
                start = mid + 1;
            } else {
                // Peak is in left half (including mid)
                end = mid;
            }
        }

        // start == end pointing to peak element index
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 5, 6, 4};
        int peakIndex = findPeak(arr);
        System.out.println("Peak element found at index: " + peakIndex + ", value: " + arr[peakIndex]);
    }
}

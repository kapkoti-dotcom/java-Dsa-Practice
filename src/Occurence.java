public class Occurence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 8};
        int target = 4;

        System.out.println(firstOccurence(arr, target));
        System.out.println(LastOccurence(arr, target));
    }

    static int firstOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result= mid;
                end=mid-1;
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    static int LastOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result= mid;
                start=mid + 1;//go right for last Occurrence
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
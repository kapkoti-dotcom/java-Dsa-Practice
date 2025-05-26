public class Main {
    public static void main(String[] args) {
        int[] arr = {9,  1, 4,5, 3};

        int swaps=isMain(arr);
        System.out.println("sorted array");
        for (int num : arr) {
            System.out.println(num + "");
        }
        System.out.println("no of swaps:"+swaps);
    }

    static int isMain(int[] arr) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int si = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[si]) {
                    si = j;

                }
            }

            if (si != i) {
                int temp = arr[si];
                arr[si] = arr[i];
                arr[i] = temp;
                swapCount++;
            }
        }


        return swapCount;
    }
}

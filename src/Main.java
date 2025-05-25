public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        isMain(arr);
        System.out.println("sorted array");
        for (int num : arr) {
            System.out.println(num + "");
        }
    }

    static void isMain(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int si = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[si]) {
                    si = j;

                }
            }


            int temp = arr[si];
            arr[si] = arr[i];
            arr[i] = temp;
        }
    }
}

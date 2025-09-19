public class test {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum = " + kadaneAlgo(arr));

    }

  static int kadaneAlgo(int[] arr) {
        int cs = 0;
        int ms = arr[0];
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs > ms) {
                ms = cs;

            }
            if (cs < 0) {
                cs = 0;
            }
        }


        return ms;
    }
}
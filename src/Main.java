import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int totalSwaps = Main(arr);
        System.out.println("total number of swaps:" + totalSwaps);
    }

    public static int Main(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        boolean swapped=false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return swapCount;
    }
}






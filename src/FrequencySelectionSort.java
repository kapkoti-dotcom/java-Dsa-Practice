import java.util.*;

public class FrequencySelectionSort {

    static class Element {
        int value;
        int freq;

        Element(int v, int f) {
            this.value = v;
            this.freq = f;
        }
    }

    public static void sortByFrequency(int[] arr) {
        // Step 1: Frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create array of Element
        Element[] elements = new Element[arr.length];
        for (int i = 0; i < arr.length; i++) {
            elements[i] = new Element(arr[i], freqMap.get(arr[i]));
        }

        // Step 3: Selection Sort
        for (int i = 0; i < elements.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j].freq > elements[maxIdx].freq ||
                        (elements[j].freq == elements[maxIdx].freq &&
                                elements[j].value < elements[maxIdx].value)) {
                    maxIdx = j;
                }
            }
            // Swap
            Element temp = elements[maxIdx];
            elements[maxIdx] = elements[i];
            elements[i] = temp;
        }

        // Step 4: Fill result array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = elements[i].value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3};

        sortByFrequency(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

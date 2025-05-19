import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        String str = "google";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (char key : freqMap.keySet()) {
            System.out.println(key + ": " + freqMap.get(key));
        }
    }
}

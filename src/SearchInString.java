public class SearchInString {
    public static void main(String[] args) {
        String[] arr = {"raj", "Aman", "Zoya", "Rita"};
        String target = "aman";
        System.out.println(SearchInString(arr,target));
    }

    static int SearchInString(String[]arr,String target) {


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals (target)) {
                return i;
            }
        }
        return -1;
    }
}
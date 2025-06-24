import java.util.Arrays;

class Main{
    public static void main(String[] args) {

    }
    static int Anagram(String S1,String S2){
        if(S1.length()!=S2.length()){
            return 0;
        }
        char[]arr1=S1.toCharArray();
        char[]arr2=S2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return 0;
            }
        }
        return 1;

    }
}





import java.util.ArrayList;
import java.util.List;

class Solution {
    public static  void main(String[] args) {
        String s="abcabcdd";
        int start=0;
        int end=0;
        int max_length=0;
        List<Character> list=new ArrayList<Character>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,list.size());

            }
            else{
                list.remove(0);
                start++;
            }


        }
        System.out.println( max_length);
    }
}
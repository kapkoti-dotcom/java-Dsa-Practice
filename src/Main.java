import java.util.ArrayList;

public class Main{
      public static void main(String[]args){
          System.out.println(countSubsequences("","abc"));
      }
    static int countSubsequences(String p,String up){
          if(up.isEmpty()){
              return 1;
          }
          char ch=up.charAt(0);
          int left=countSubsequences(p+ch,up.substring(1));
          int right=countSubsequences(p,up.substring(1));
          return left+right;

     }
      }

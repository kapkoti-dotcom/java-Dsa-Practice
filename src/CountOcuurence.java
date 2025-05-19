public class CountOcuurence {
    public static void main(String[] args) {
      int[]arr={1,3,7,3,9,3};
      int target=3;
      int count=0;
      for(int num:arr){
          if(num==target){
              count++;
          }
      }
        System.out.println("element" + target + "occurence" + count + "times");
    }
}
public class Main {
    public static void main(String[] args) {
        int[]arr={1,2,1,3,5,6,4};
        int peakIndex=Main(arr);
        System.out.println("peak element"+peakIndex+",value"+Main(arr));

    }
    static int Main(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                right= mid;
            } else{
                left=mid+1;
            }
        }
        return left;
    }
      }
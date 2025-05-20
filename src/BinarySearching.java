public class BinarySearching {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11};
        int target=7;
        System.out.println(BinarySearching(arr,target));
    }
    static int BinarySearching(int[ ]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start=mid+1;

            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
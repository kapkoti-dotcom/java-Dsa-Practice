public class Search2DMatrix {
    public static void main(String[] args) {
        int[][]arr={{1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}};
        int target =3;
        boolean found=Search2DMatrix(arr,target);
        System.out.println("target"+target+(found ?"found":"not found"));
    }
    static boolean Search2DMatrix(int[][]arr, int target){
        int rows=arr.length;
        int cols=arr[0].length;
        int left=0;
        int right=rows*cols-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midValue=arr[mid/cols][mid%cols];
            if(midValue==target){
                return true;
            } else if (midValue<target) {
                left=mid+1;

            }else{
                right=mid-1;
            }
        }
        return false;
    }

}
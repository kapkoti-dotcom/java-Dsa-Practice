public class test{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        int target=6;
        int[] result = twoSum(arr, target);

        if (result.length > 0) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found!");
        }

    }
     static int []twoSum(int[]arr,int target){
        int left=0,right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{arr[left],arr[right]};
            } else if (sum<target) {
                left++;

            }
            else{
                right--;
            }
        }
        return new int[]{};
    }
}
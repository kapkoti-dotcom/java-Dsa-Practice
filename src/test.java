import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));


    }

    /*static int []twoSum(int[]arr,int target){
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
}*/
/*public static List<List<Integer>>threeSum(int[]nums){
    List<List<Integer>>result=new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i< nums.length-2;i++){
        if(i>0&&nums[i]==nums[i-1])continue;
        int left=i+1,right= nums.length-1;
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==0){
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left<right&&nums[left]==nums[left+1])left++;
                while(left<right&&nums[right]==nums[right-1])right--;
                left++;
                right--;
            } else if (sum<0) {
                left++;
                
            }else{
                right--;
            }

        }

    }
    return result;
}
}*/
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }

}


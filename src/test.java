import java.util.ArrayList;
import java.util.Arrays;




public class test {
    public static void main(String[] args) {
        int []arr={2,7,1,5,0,1,12};
        pigonhole(arr);


        System.out.println("array"+Arrays.toString(arr));




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
    /*public static int maxArea(int[] height) {
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

}*/
    //transpose of matrix
   /* public void rotate (int[][]matrix){
        int n=matrix.length;
        transpose(matrix,n);
        // reverse rows
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
    static  void swap(int matrix[][],int i,int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
static void transpose(int matrix[][],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            swap(matrix,i,j);
        }
    }
}
}*/
public  static void pigonhole(int []arr){
    int n=arr.length;
    int maxEl=Integer.MIN_VALUE;
    int minEl=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>maxEl){
            maxEl=arr[i];
        }
        if(arr[i]<minEl){
            minEl=arr[i];
        }
    }
    if(maxEl==Integer.MIN_VALUE||minEl==Integer.MAX_VALUE){
        System.out.println("empty array");
        return;
    }
int size=maxEl-minEl+1;
    int pigonhole[]=new int[size];
    for(int i=0;i<n;i++){
        int index=arr[i]-minEl;
        pigonhole[index]++;
    }
    int insertionIndex=0;
    for(int j=0;j<size;j++){
        while(pigonhole[j]>0){
            arr[insertionIndex]=j+minEl;
            insertionIndex++;
            pigonhole[j]--;
        }
    }
}
}

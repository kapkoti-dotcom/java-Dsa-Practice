import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int arr[] = {10, 30, 25, 45, 35, 555,};
        int index=ternarySearch(arr,555);
        if(index==-1){
            System.out.println("element not found");
        }else{
            System.out.println("found at element at index"+index);
        }


    }

    /* findMaxMin(arr);
 static void findMaxMin(int arr[]){
     if(arr.length==0) {
         System.out.println("Array is empty");
         return;

     }
     int Max_val=arr[0];
     int Min_val=arr[0];
     for(int i=1;i<arr.length;i++){
         if(arr[i]>Max_val){
             Max_val=arr[i];
         }
         if(arr[i]<Min_val){
             Min_val=arr[i];
         }

     }
     System.out.println("maximum element"+Max_val);
     System.out.println("minimum element"+Min_val);
 }
}*/
/*static void ReverseArray(int arr[]){
    int left=0;
    int right=arr.length-1;
    while(left<right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
}*/
/*static void findSecondLargest(int[]arr){
    if(arr.length<2){
        System.out.println("array should have atleast two elements");
        return ;
    }
    int largest=Integer.MIN_VALUE;
    int secondlargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondlargest=largest;
            largest=arr[i];
        } else if (arr[i]>secondlargest&&arr[i]!=largest) {
            secondlargest=arr[i];
            
        }
    }
    System.out.println("largest element "+secondlargest);
}
}*/
/*public static int jumpsearch(int[]arr,int target){
    int n=arr.length;
    int bs=(int)Math.sqrt(n);
    int start=0;
    int end=bs;
    while(end<n&&arr[end]<=target){
        start=end;
        end+=bs;
        if(end>n){
            end=n;
        }
    }int res=-1;
    for(int i=start;i<end;i++){
        if(target==arr[i]){
                res=i;
        }
    }
    return res;
    }
}*/
    public static int ternarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        int index = -1;
        while (start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;
            if (target <= arr[mid1]) {
                if (target == arr[mid1]) {
                    index = mid1;
                    break;
                }
                end = mid1 - 1;
            } else if (target >= arr[mid2]) {
                if (target == arr[mid2]) {
                    index = mid2;
                    break;

                }
                start = mid2 + 1;
            } else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return index;
    }
}

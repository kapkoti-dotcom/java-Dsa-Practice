import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int arr[] = {10, 30, 25, 45};
        findSecondLargest(arr);

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
static void findSecondLargest(int[]arr){
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
}

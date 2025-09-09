class Main{
    public static void main(String[] args) {
        int arr[]={10,30,25,45};
        findMaxMin(arr);

    }
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
}
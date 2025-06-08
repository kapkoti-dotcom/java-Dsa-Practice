public class Main {
    public  static void main(String[]args){
        int[]arr={7,2,5,1,9};
        bubbleSort(arr);
        for(int num:arr){
            System.out.println(num+" ");
        }


    }
    static void bubbleSort(int[]arr){
        for(int i=0;i< arr.length-1;i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+ 1] = temp;
                }
            }
        }
    }
}
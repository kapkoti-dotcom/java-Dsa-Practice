class Main{
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0]=2;
        arr[1]=4;
        arr[2]=5;
        arr[3]=7;
        arr[4]=8;
        arr[5]=78;
        int n= 6;
            int pos = 1;
            int element = 3;
            for(int i=n;i>pos;i--) {
                arr[i ] = arr[i-1];

            }
            arr[pos] = element;
            n++;
            for(int i=0;i<n;i++){
                System.out.println(arr[i]+" ");
            }

        }

    }


class Main {
    public static double posAverage(int[] arr) {
        // Code here
        int n=arr.length;
        double ans=0.0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                count++;
                ans+=arr[i];
            }
        }
        if(count<=0)return 0.0;
        double avg=ans/count;
        return avg;
    }
}

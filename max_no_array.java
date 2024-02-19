public class max_no_array {
    public static void main(String[] args) {
        int arr[]={2,6,4,9,8,3,6,0,6};
        int maxans=max(arr);
        System.out.println(maxans);
        int min=min(arr);
        System.out.println(min);
    }
    public static int max(int arr[]){
     int max=arr[0];
     for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
     }
     return max;
    }
    public static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
       if(arr[i]<min){
        min=arr[i];
       }
        }
        return min;
    }
}

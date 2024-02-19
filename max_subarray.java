import java.util.*;
public class max_subarray {
   public static void main(String[] args) {
    int []arr={-2,1,-3,4,-1,2,1,-5,4};
    int ans=maxsubarray(arr);
    System.out.println(ans);
     
   } 

   public static int maxsubarray(int[]arr){
    int max_sum=arr[0];
    int current_sum=arr[0];
    for(int i=0;i<arr.length;i++){
       current_sum=current_sum+arr[i];
       
       if(current_sum>max_sum){
           max_sum=current_sum; 
       }
       if(current_sum<0){
           current_sum=0;
       }
    }
    return max_sum;
   }
}

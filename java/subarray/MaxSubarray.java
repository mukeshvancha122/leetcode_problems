package subarray;

public class MaxSubarray {
    public static void main(String[] args) {
        
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int maxSubarray=arr[0];
        int currentMaxSubarray=arr[0];

        for(int i=1;i<arr.length;i++){
            currentMaxSubarray=Math.max(arr[i],currentMaxSubarray+arr[i]);
            maxSubarray=Math.max(currentMaxSubarray,maxSubarray);
        }
        System.out.println(maxSubarray);
    }
    
}

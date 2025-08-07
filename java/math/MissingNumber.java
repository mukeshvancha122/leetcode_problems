public class MissingNumber {

    public static void main(String[] args) {
        int[] nums={1,3,2,0};
        int missingValue=missingNumber(nums);
        System.out.println(missingValue);
    }
    public static int missingNumber(int[] nums){
        int n=nums.length;
        int sum=n*(n+1)/2;
        System.out.println(sum);
        for(int num:nums){
            sum= sum-num;
        }
        return sum;
    }
    
}
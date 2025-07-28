package arrays;
import java.util.HashMap;

public class CommonPrefixTwo{
    public static void main(String[] args){
        int[] nums={1,0,1,1};
        int k=1;
        boolean decision=containsNearbyDuplicate(nums,k);
        System.out.println(decision);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int preIndex=map.get(nums[i]);
                if(i-preIndex<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
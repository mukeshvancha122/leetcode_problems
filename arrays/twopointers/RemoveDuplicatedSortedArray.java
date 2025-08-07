package arrays.twopointers;

import java.util.*;

public class RemoveDuplicatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
    }

    public static  int removeDuplicates(int[] nums) {
            int j=0;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=nums[j]){
                    nums[j+1]=nums[i];
                    count++;
                }
                j++;
            }
            return count;
        }
}
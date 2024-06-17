package com.whh.algorithm.array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(nums,val));
    }
    public int removeElement(int[] nums,int val){
        int slow = 0;
        for(int fast = 0;fast < nums.length;fast ++){
            if (nums[fast] != val){
                nums[slow ++] = nums[fast];
            }
        }
        return slow;
    }
}

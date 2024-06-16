package com.whh.algorithm.array;

public class BinarySearch {
    public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		BinarySearch binarySearch = new BinarySearch();
		System.out.println(binarySearch.search(nums,target));
    }
    public int search(int[] nums,int target){
        int left = 0;
		int right = nums.length - 1;
		while(left <= right){
			int mid = left + (right - left) / 2;
			if(nums[mid] > target){
				right = mid - 1;
			}else if(nums[mid] < target){
				left = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
    }
}

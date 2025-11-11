class Solution {
    public int search(int[] nums, int target) {
        
     int left= 0;
        int right= nums.length - 1;
        while (left<=right){
            int mid = (left + right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if (nums[mid]>=nums[left]){//Checks if left half is sorted
                if (nums[left] <= target && target <= nums[mid]){   //Is, the atrget inside the sorted half
                    right=mid-1;
                }
                else{//If no take the other half
                    left=mid+1;
                }

            } else if (nums[mid]<=nums[right]) {//Checks if right half is sorted
                if (nums[mid] <= target && target <= nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
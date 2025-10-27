class Prob_no_34 {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        int l = BinarySearch(nums, target, true);
        int r = BinarySearch(nums, target, false);
        ans[0] = l;
        ans[1] = r;
        return ans;
    }
    public int BinarySearch(int[] nums, int target, boolean isLeft){
        int l = 0;
        int r = nums.length-1;
        int in = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>target){
                r= mid -1;
            }
            else if(nums[mid]<target){
                l = mid +1;
            }
            else{
                in = mid;
                if(isLeft){
                    r = mid - 1;
                }
                else{
                    l = mid +1;
                }
            }
        }
        return in;
    }
}
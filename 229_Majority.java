import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        int threshold = n / 3;

        if (n == 1) {
            list.add(nums[0]);
            return list;
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > threshold && !list.contains(nums[i - 1])) {
                    list.add(nums[i - 1]);
                }
                count = 1;
            }
        }

    
        if (count > threshold && !list.contains(nums[n - 1])) {
            list.add(nums[n - 1]);
        }

        return list;
    }
}

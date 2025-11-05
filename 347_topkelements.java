import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums.length < 2 && k == 1) {
            return nums;
        }
        int count = 1;
        List<Integer> values = new ArrayList<>();
        List<Integer> freq = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                count++;
            } else {
                values.add(nums[i - 1]);
                freq.add(count);
                count = 1;
            }
        }

        // Add last element
        values.add(nums[nums.length - 1]);
        freq.add(count);

        // Sort values by their frequencies (descending)
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            pairs.add(new int[]{values.get(i), freq.get(i)});
        }

        pairs.sort((a, b) -> b[1] - a[1]); // Sort by frequency descending

        int[] arr = new int[Math.min(k, pairs.size())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pairs.get(i)[0];
        }
        return arr;
    }
}

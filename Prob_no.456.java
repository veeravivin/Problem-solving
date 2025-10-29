
import java.util.Stack;

class Prob_no_456 {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int l = Integer.MIN_VALUE;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]<l){
                return true;
            }
            while(!s.isEmpty() && s.peek()<nums[i]){
                l = s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int count = 0;

       HashSet<Character> set =new HashSet<>();
       int left=0;
       for(int right=0;right<s.length();right++)
       {
            while (set.contains(s.charAt(right))) {
              set.remove(s.charAt(left));
              left++;
           }
           set.add(s.charAt(right));
           count=right-left+1;
           if(count>max)
           {
            max=count;
           }
           

       }

        return max;
    }
}

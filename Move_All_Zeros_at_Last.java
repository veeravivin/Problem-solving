class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,0,0,0};
        int n = nums.length;
        int i = 0;
        int j = 1;
        while(j<n){
            if(nums[i]==0 && nums[j]!=0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j++;
            }
            else if(nums[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        for(int k = 0;k<n;k++){
            System.out.print(nums[k]+",");
        }
    }
}
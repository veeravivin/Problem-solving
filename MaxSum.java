class Solution {
    public int maxSum(int[][] arr) {
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i+2<arr.length;i++)
        {
           for(int j=0;j<arr[0].length-2;j++){
            int sum=0;
            for(int k=j;k<j+3 && k<arr[0].length;k++){
                sum+=arr[i][k];
            }
            sum+=arr[i+1][j+1];
            for(int k=j;k<j+3 && k<arr[0].length;k++){
                sum+=arr[i+2][k];
            }
            if(max<sum)
               max=sum;
           }

        }
        return max;
    }
}
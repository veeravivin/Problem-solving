public class Solution {
    public int countPrimes(int n) {
        boolean[] nonprime = new boolean[n];
        int count = 0;
        for(int i = 2;i<n;i++){
            if(nonprime[i]==false){
                count++;
                for(int j = 2;j*i<n;j++){
                    nonprime[i*j]=true;
                }
            }
        }
        return count;
    }
}
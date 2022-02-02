class Solution {
    public int climbStairs(int n) {
        int[] c = new int[n+1];
        return climb(n,c);
    }
    public int climb(int n,int[] c){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(c[n]!=0){
            return c[n];
        }
        return c[n] = climb(n-1,c)+climb(n-2,c);
    }
}
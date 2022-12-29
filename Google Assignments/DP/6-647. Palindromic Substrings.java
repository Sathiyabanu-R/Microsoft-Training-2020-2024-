class Solution {
    public int countSubstrings(String s) {
       int d=s.length();
       boolean dp[][] = new boolean[d][d];
       int c=0;
       for(int i=d-1;i>=0;i--){
           for(int j=i;j<d;j++){
               if(s.charAt(i)==s.charAt(j) && (j-i<3 || dp[i+1][j-1]==true)){
                   dp[i][j]=true;
                   c++;
               }
           }
        }
        return c;
    }
}

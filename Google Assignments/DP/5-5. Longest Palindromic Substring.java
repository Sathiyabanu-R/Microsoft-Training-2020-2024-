class Solution{
     public String longestPalindrome(String s) {
         String res=null;
         int d=s.length();
         boolean dp[][] = new boolean[d][d];
        for(int i=d-1;i>=0;i--){
            for(int j=i;j<d;j++){
                dp[i][j]=s.charAt(i)==s.charAt(j) && (j-i<3 || dp[i+1][j-1]);
                if(dp[i][j] && (res==null || j-i+1 >res.length())){
                    res=s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}

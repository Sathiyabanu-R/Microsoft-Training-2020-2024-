class Solution {
    Map<String,Boolean> map=new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int n=s1.length();
        return func(s1,s2,n);
    }
    public boolean func(String s1,String s2,int n){
        if(s1.equals(s2)){
           map.put(s1+"#"+s2,true);
            return true;
        }
        else if(s1.length()==1){
            return false;
        }
        else if(map.containsKey(s1+"#"+s2)){
            return map.get(s1+"#"+s2);
        }
        for(int k=1;k<=n-1;k++){
            boolean cond1=func(s1.substring(0,k),s2.substring(0,k),k) &&func(s1.substring(k,n),s2.substring(k,n),n-k);
            boolean cond2=func(s1.substring(0,k),s2.substring(n-k,n),k) && func(s1.substring(k,n),s2.substring(0,n-k),n-k);
            if(cond1|| cond2){
                map.put(s1+"#"+s2,true);
                return true;
            }
        }
        map.put(s1+"#"+s2,false);
        return false;
        
    }
}
/*
Example 1:
Input: s1 = "great", s2 = "rgeat"
Output: true
Explanation: One possible scenario applied on s1 is:
"great" --> "gr/eat" // divide at random index.
"gr/eat" --> "gr/eat" // random decision is not to swap the two substrings and keep them in order.
"gr/eat" --> "g/r / e/at" // apply the same algorithm recursively on both substrings. divide at random index each of them.
"g/r / e/at" --> "r/g / e/at" // random decision was to swap the first substring and to keep the second substring in the same order.
"r/g / e/at" --> "r/g / e/ a/t" // again apply the algorithm recursively, divide "at" to "a/t".
"r/g / e/ a/t" --> "r/g / e/ a/t" // random decision is to keep both substrings in the same order.
The algorithm stops now, and the result string is "rgeat" which is s2.
As one possible scenario led s1 to be scrambled to s2, we return true.

Example 2:
Input: s1 = "abcde", s2 = "caebd"
Output: false

Example 3:
Input: s1 = "a", s2 = "a"
Output: true   */

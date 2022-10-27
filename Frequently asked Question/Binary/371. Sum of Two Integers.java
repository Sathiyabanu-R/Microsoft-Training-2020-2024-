class Solution {
    public int getSum(int a, int b) {
       while(b!=0){
           int temp=(a&b)<<1;   // and operater and shift 1.
           a=a^b;   // ^ -> xor operater
           b=temp;
       } 
        return a;
    }
}
/*
Example 1:
Input: a = 1, b = 2
Output: 3

Example 2:
Input: a = 2, b = 3
Output: 5
*/

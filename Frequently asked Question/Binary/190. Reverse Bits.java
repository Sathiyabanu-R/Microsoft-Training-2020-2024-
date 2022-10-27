public class Solution {
    public int reverseBits(int n) {
        int rev=0;
        for(int i=0;i<32;i++){
            rev <<=1;   
            rev |= (n & 1);    //bitiwise or
            n>>=1;  // to remove the last bit we use the right sift 
            // 5 >>1 =2  0101 --> 0010 --> here the last digit is removed.
            }
        return rev;
    }
}
/*
Example 1:
Input: n = 00000010100101000001111010011100
Output:    964176192 (00111001011110000010100101000000)
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.

Example 2:
Input: n = 11111111111111111111111111111101
Output:   3221225471 (10111111111111111111111111111111)
Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.
*/

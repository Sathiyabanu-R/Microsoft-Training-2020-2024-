class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int s=1,e=x;
        while(s<e){
            int mid=s+(e-s) / 2;
            if(mid<=x / mid && (mid+1)>x / (mid+1))
                  return mid;
            else if(mid>x / mid)
                e=mid;
            else
                s=mid+1;
        }
        return s;
    }
}
/*
Example 1:
Input: x = 4
Output: 2

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.   */

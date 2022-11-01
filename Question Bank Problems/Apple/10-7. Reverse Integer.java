class Solution {
    public int reverse(int x) {
        int n=Math.abs(x);
        int num=0;
        int max=Integer.MAX_VALUE/10;
        while(n>0){
            if(num>max){
                return 0;
            }
            int rem=n%10;
            num=num*10+rem;
            n=n/10;
        }
        if(x<0){
            return num*-1 ;
        }
        return num;
    }
}

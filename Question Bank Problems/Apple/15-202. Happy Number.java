class Solution{
public boolean isHappy(int n) {
        int rem, sum=0;
        for(int i=0; i<5; i++){
            while(n>0){
                rem=n%10;
                sum+= rem*rem;
                n/=10;
            }
            n=sum;
            sum=0;
            if(n==1||n==10||n==100)
                return true;
        }
        return false;
    }
}

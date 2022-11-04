class Solution {
    public int trap(int[] height) {
        //its a very simple problem. we have to use space to solve it efficiently
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int res=0;
        //now start filling the array left will be containing the max in left 
        //and simalary for the right
        for(int i=0;i<n;i++){
            if(i==0){
                left[i]=height[i];
            }
            else{
                left[i]=Math.max(left[i-1],height[i]);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                right[i]=height[i];
            }
            else{
                right[i]=Math.max(right[i+1],height[i]);
            }
        }
       // System.out.print(Arrays.toString(left));
       // System.out.print(Arrays.toString(right)); print the values of left and right
        for(int i=0;i<n;i++){
            res+=Math.min(left[i],right[i])-height[i];

        }
        return res;
    }
}
 // TC :O(n) SC : O(n)

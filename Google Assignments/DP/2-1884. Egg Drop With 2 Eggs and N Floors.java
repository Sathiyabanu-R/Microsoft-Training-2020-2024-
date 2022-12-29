class Solution {
    public int twoEggDrop(int n) {  // no of floors
        int max=0;
        while(max*(max+1)/2 < n){
            max++;
        }
        return max;
    }
}

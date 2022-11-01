class Solution {
    public String longestCommonPrefix(String[] str) {
        String  result=str[0];
        for(int index=0;index<str.length;index++){
            while(str[index].indexOf(result)!=0){
                result=result.substring(0,result.length()-1);
            }
        }
        return result;
    }
}

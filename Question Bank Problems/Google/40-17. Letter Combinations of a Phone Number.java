class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
           return new ArrayList<>();
        }
        List<String> result=new ArrayList<>();
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        result.add("");
        for(char d:digits.toCharArray()){
          List<String> list=new ArrayList<>();
            for(String combination : result){
                for(char c : map[d-'0'].toCharArray()){
                    list.add(combination + c);
                }
            }
            result=list;
        }
        return result;
    }
}

// TC : O(4^n)  SC : O(n)

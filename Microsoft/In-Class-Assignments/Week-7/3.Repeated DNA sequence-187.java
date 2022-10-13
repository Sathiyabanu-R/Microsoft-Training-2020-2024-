class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int len=s.length();
        HashSet<String> set1=new HashSet<>();
       HashSet<String> set2=new HashSet<>();
      
        for(int i=0;(i+9)<len;i++){
            if(!set1.contains(s.substring(i,i+10))){
            set1.add(s.substring(i,i+10));
            }else{
                if(!set2.contains(s.substring(i,i+10))){
                    set2.add(s.substring(i,i+10));
                    
                }
            }
        }
        return new ArrayList(set2);
    }
}
/*
The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.
Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

Example 1:
Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]

Example 2:
Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"] 
*/

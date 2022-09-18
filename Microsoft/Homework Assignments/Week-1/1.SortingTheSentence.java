class Solution {
    public String sortSentence(String s) {
      String[] words = s.split(" ");
      String[] ans = new String[words.length];

    for(String w: words){
        int c = (int)w.charAt(w.length()-1) - 48;
        ans[c-1] = w.substring(0, w.length()-1);
    }
    return String.join(" ", ans);
}  
}
/*
Example 1:
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

Example 2:
Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 */

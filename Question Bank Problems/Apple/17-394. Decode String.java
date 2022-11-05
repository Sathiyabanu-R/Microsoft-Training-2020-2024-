class Solution {
    public String decodeString(String s) { 
        Stack<Integer> countStack = new Stack<>();  
        Stack<String> wordStack = new Stack<>();
        int n=0;
        StringBuilder word = new StringBuilder();
        for(int i=0;i<s.length();i++){     // O(n)
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                n=n*10+(ch-'0');
            }
            else if(Character.isLetter(ch)){
                word.append(ch);
            }
            else if(ch=='['){
                countStack.add(n);
                wordStack.add(word.toString());
                n=0;
                word = new StringBuilder();
            }
            else{
                int count=countStack.pop();
                StringBuilder duplicatedString = new StringBuilder(wordStack.pop());
                for(int j=1;j<=count;j++){     //O(m)
                    duplicatedString.append(word);
                }
                word=duplicatedString;    
            }
        }
        return word.toString();
    }
}

// TC : O(n*m)   SC : O(n+m)

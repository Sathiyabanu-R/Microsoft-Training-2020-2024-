class Solution {
    public String minWindow(String s, String t) {
        if(s==null || t==null || s.isEmpty() || t.isEmpty()){
            return "";
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
  //map.getOrDefault(k,default_val); //if key k exists, get it else return the specified default value
            map.put(ch,map.getOrDefault(ch,0)+1);  
        }
        int i=0,j=0,count=map.size();
        int left=0 , right=s.length()-1 , minLength=s.length();
        boolean found = false;
        while(j<s.length()){
            char endChar=s.charAt(j++);
            if(map.containsKey(endChar)){
                map.put(endChar,map.get(endChar)-1);
                if(map.get(endChar)==0){
                    count-=1;
                }
            }
            if(count>0){
                continue;
            }
            while(count==0){
                char startChar=s.charAt(i++);
                if(map.containsKey(startChar)){
                     map.put(startChar,map.get(startChar)+1);
                     if(map.get(startChar)>0){
                         count+=1;
                     }
                 }
             }
             if((j-i)<minLength){
                 left=i;
                 right=j;
                 minLength=j-i;
                 found = true;
             }
        }
        return !found ? "" : s.substring(left-1,right);
    }
}

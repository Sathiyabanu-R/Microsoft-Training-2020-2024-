class Solution {
    public String convert(String s, int numRows) {
    Map<Integer,StringBuilder>map=new HashMap<>();
    int c=0;
    boolean p=true;
    for(char ch : s.toCharArray()){
        if(c==numRows){
            p=false;
        }
        if(c==1){
            p=true;
        }
        if(p){
            c++;
        }
        else{
            c--;
        }
        if(!map.containsKey(c)){
            map.put(c,new StringBuilder());
        }
        map.get(c).append(ch);
    }
    StringBuilder str = new StringBuilder();
    for(int i : map.keySet()){
        str.append(map.get(i));
    }
    return str.toString();
    }
}

int min(int a,int b,int c){
    return (a<=b)&&(a<=c)?a:(b<=c)?b:c;
}

int minDistance(char * word1, char * word2){
    int m=strlen(word1);
    int n=strlen(word2);
    int edit[m+1][n+1];
    for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
            if(i==0){
                edit[i][j]=j;
            }else if(j==0){
                edit[i][j]=i;
            }else if(word1[i-1]==word2[j-1]){
                edit[i][j]=edit[i-1][j-1];
            }else{
                edit[i][j]=1+min(edit[i-1][j],edit[i][j-1],edit[i-1][j-1]);
            }
        }
    }
    return edit[m][n];
}
/*
Example 1:
Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')

Example 2:
Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
*/

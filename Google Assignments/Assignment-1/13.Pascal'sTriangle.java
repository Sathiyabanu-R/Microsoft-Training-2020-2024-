import java.util.Scanner;
class Main {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int space=n;
  int num=1;
  for(int i=0;i<n;i++){
    for(int j=1;j<=space;j++){
      System.out.print(" ");
    }
    num=1;
    for(int k=0;k<=i;k++){
      System.out.print(num+" ");
      num=num*(i-k)/(k+1);
    }
    space--;
    System.out.println();
  }
}
}

--------------------------------------------------

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int mat[][]=new int[d+1][d+1];
    for(int i=1;i<=d;i++){
      for(int j=1;j<=i;j++){
        if(i==j){
          mat[i][j]=1;
          System.out.print("1");
        }
        else if(j==0){
          mat[i][j]=1;
          System.out.print("1");
        }
        else{
          mat[i][j]=mat[i-1][j]+mat[i-1][j-1];
          System.out.print(mat[i][j]);
        }
      }
    System.out.println();
    }
  }
}
/* 3     4          9
  1      1         1
  11     11        1 1
  121    121       1 2 1
         1331      1 3 3 1  
                   1 4 6 4 1 
                   1 5 10 10 5 1
                   1 6 15 20 15 6 1
                   1 7 21 35 35 21 7 1
                   1 8 28 56 70 56 28 8 1 */

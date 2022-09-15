import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    for(int i=d;i>=1;i--){
      for(int j=i;j>=1;j--){
        System.out.print(j);
      }
  System.out.println();
    }
  }
}
/* input : 5 
   output:  54321 
            4321 
            321
            21
            1 
*/

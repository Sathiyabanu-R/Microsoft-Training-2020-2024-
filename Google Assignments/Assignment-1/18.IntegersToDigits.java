import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int arr[]=new int[100];
    int i=0;
    int rem=0;
    while(d!=0){
      rem=d%10;
      arr[i]=rem;
      i++;
      d=d/10;
    }
    for(int j=i-1;j>=0;j--){
      System.out.println(arr[j]+" ");
    }
  }
}
/* input:1234
  output:1 2 3 4 */   

-------------------------------------------------------
  
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    while(d>0){
      System.out.println(d%10);
      d=d/10;
    }
  }
}  
/* Input : 12345 
   Output : 5 4 3 2 1 */ 

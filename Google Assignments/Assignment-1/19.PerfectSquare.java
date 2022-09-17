import java.util.*;
class Main {
  public static boolean isPerfectSquare(int n){
  if(n>=0){
    int s=(int)Math.sqrt(n);
    return ((s*s)==n);
  }
  return false;
}
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(isPerfectSquare(n)){
      System.out.println("Perfect Square");
    }
    else{
      System.out.println("Not a Perfect Square");
    }
  } 
}

/*  4 
    Perfect Square 
    8 
    Not a Perfect Square  */

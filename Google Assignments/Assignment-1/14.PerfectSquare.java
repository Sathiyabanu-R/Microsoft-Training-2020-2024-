import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double n=sc.nextInt();
    double s=Math.sqrt(n);
    if(s*s==n){
        System.out.println("Perfect Square");
    }
    else{
      System.out.println("Not a Perfect Square");
    }
  }
}  
/*  input :4 
    output :Perfect Square 
    input :8 
    output :Not a Perfect Square  */

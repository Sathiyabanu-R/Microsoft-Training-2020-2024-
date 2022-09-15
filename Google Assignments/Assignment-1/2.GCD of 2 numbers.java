import java.util.Scanner;
class Main {
  public static int GCD(int a,int b){
    if(a==0){
      return b;
    }
    return GCD(b%a,a);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(GCD(a,b));
  }
}

/* input :4 2 
   output :2 
   input :10 12 
   output :2
   input :0 3
   output :3  */

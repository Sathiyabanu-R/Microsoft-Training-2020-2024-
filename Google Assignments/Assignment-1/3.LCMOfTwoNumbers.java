import java.util.Scanner;
class Main {
  public static int GCD(int a,int b){
    if(a==0){
      return b;
    }
    return GCD(b%a,a);
  }
  public static int LCM(int a,int b){
   // return (a/GCD(a,b))*b;
    return (a*b)/GCD(a,b);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(LCM(a,b));
  }
}

/* input :10 12
   output :60 
   explanation :gcd(10 12)=2 
              lcm=10*12 /2 =60
 input: 5 6 
 output: 30
*/

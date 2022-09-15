import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double area =Math.PI*n*n;
    System.out.print(area);
    //System.out.printf("%.2f",(float)area);
  }
}

/* input : 3 
   output :28.27433388230
   input : 8 
   output :201.06192982974
*/

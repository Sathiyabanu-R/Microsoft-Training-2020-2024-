import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int x3=sc.nextInt();
    int y3=sc.nextInt();
    double area1=Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
    System.out.println(area1/2);
  }
}

/* input: 1 2 3 4 5 6 
  output: 0.0 

  input: 1 -2 -3 4 2 3
  output: 13.0 */
   

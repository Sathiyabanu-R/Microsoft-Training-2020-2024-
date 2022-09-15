import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int fact=1;
    for(int i=1;i<=a;i++){
       fact=fact*i;
    }
  System.out.print(fact);
  }
}

/*input : 5       input :4
  output : 120    output :24 
  */

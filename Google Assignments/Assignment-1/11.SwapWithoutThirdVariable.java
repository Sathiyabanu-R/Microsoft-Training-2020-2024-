import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int s=sc.nextInt();
    System.out.println("Before Swapping: "+d +" "+s);
    d=s*d;         
    s=d/s; 
    d=d/s;
    /*Swapping condition
    d=d+s;
    s=d-s;
    d=d-s; */
    System.out.println("After Swapping: "+d +" "+s);
  }
}

/*input : 10 20 
  Before Swapping : 10 20 
  After Swapping : 20 10 
  */



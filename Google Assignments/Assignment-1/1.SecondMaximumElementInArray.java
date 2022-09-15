
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int arr[]=new int[d];
    for(int i=0;i<d;i++){
      arr[i]=sc.nextInt();
    }
    int max=arr[0],secmax=arr[0];
    for(int i=0;i<d;i++){
      if(arr[i]>max){
        secmax=max;
        max=arr[i];
      }
    }
    System.out.println(secmax);
  }
}
/*
 input  :5 
         10 20 30 40 50 
 output :40     
 input  :4
         30 49 50 56
 output :50
*/ 

import java.util.*;
class Main {
  //sum of elements in array /total number
  public static void mean(int arr[],int d){
    int sum=0;
    for(int i=0;i<d;i++){
      sum=sum+arr[i];
    }
    System.out.println(sum/d);
  }
  //middle element n is odd and average of middle two elements when N is even .
  public static void median(int arr[],int d){
    int mid=d/2;
    if(d%2!=0){
      System.out.println(arr[mid]);
    }
    else{
      System.out.println(arr[mid]+arr[mid+1]/2);
    }
  }
  // most frequently occuring element in an array.
  public static void mode(int arr[],int d){
    int max=arr[0],count=0;
    for(int i=0;i<d;i++){
      int c=0;
      for(int j=i+1;j<d;j++){
        if(arr[i]==arr[j]){
          c+=1;
        }
      }
      if(c>count){
        count=c;
        max=arr[i];
      }
    }
    System.out.println(max);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int arr[]=new int[d];
    for(int i=0;i<d;i++){
      arr[i]=sc.nextInt();
    }
    mean(arr,d);
    median(arr,d);
    mode(arr,d);
  }
}

/* input :5               6
         2 3 4 4 3       3 5 6 7 8 9
         output : 3      6 
                  4      11 
                  3      3    */
       
       
       
       
       

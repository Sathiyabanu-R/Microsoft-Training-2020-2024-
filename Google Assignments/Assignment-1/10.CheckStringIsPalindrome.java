import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    String myString = sc.next();
    StringBuffer buffer = new StringBuffer(myString);
    buffer.reverse();
    String data = buffer.toString();
    if(myString.equals(data)){
        System.out.println("Palindrome");
      }
    else {
      System.out.println("Not Palindrome");
    }
  }
}
-----------------------------------
import java.util.*;
class Main {
  public static void main(String[] args)
  Scanner sc=new Scanner(System.in);
  String String = sc.next();  
  String rev="";
  int len=String.length();
  for(int i=len-1;i>=0;i--){
     rev=rev+String.charAt(i);
  }
  if(String.equals(rev)){
     System.out.println("Palindrome");
  }
  else{
     System.out.println("Not Palindrome");
  }
 }
}


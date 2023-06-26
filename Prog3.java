import java.util.*;
class Prog3{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the first string");
    String str1=s.nextLine();
    System.out.println("enter the second string");
    String str2=s.nextLine();
    String str3=concatString(str1,str2);
    System.out.println(str3);
    
  }
  static String concatString(String str1, String str2){
    String str3=str1.concat(str2);
    return str3;
  }
}
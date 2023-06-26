import java.util.Scanner;
class Prog6{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int count=0;
    String str="hi, hello how are you";
    char c=s.next().charAt(0);
    for(int i=0;i<str.length();i++){
      if(c==str.charAt(i)){
        count++;
      }
    }
    System.out.println("the letter "+c+" is repeating "+count+" times");
  }
}
import java.util.Scanner;
class Prog4{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the sentence");
    String str=s.nextLine();
    count(str);
    System.out.println(words.length);
    
  }
  static String count(String str){
    String words[]=str.split(" ");
    return words;
  }
}
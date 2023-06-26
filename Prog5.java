import java.util.Scanner;
class Prog5{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    Prog5 p=new Prog5();
    String str2=p.subStringDemo(str);
    System.out.println(str2);
  }
   String subStringDemo(String str){
    String str2=str.substring(3, 10);
    return str2;
  }
}
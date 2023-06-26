import java.util.Scanner;
class Prog7{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int count=1;
    String str="hi hello how are you";
    for(int i=0;i<str.length();i++){
      count=1;
      for(int j=i+1;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
          count++;
          
        }
      }
      char ch=str.charAt(i);
      str=str.replace(ch,' ');
      if(count!=0 && str.charAt(i)!=' '){
        System.out.println(str.charAt(i)+" : "+count);
      }
    }
  }
}
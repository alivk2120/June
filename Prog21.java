import java.util.*;
class Prog21{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    char ch[]=str.toCharArray();
    for(int i=0;i<ch.length;i++){
      if(ch[i]>='a' && ch[i]<='z'){
        ch[i]=(char)(ch[i]-32);
      }
    }
    for(int j=0;j<ch.length;j++){
      System.out.print(ch[j]);
    }
  }
}

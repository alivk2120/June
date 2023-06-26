import java.util.Scanner;
class Revers{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num=0,count=0,sum=0,dig,rev=0;
    System.out.println("Enter the number");
    num=s.nextInt();
    while(num!=0){
      dig=num%10;
      rev=(rev*10)+dig;
      num=num/10;
    }
    System.out.println("the reverse of numbers is " +rev);
  }
}
import java.util.Scanner;
class Addelem{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={23,34,45,43,22};
    System.out.println("enter the number to add");
    int num=s.nextInt();
    arr[arr.length]=num;
    for(int i=0;i<arr.length+1;i++){
      System.out.print(arr[i]);
    }
  }
}
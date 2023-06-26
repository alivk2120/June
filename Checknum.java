import java.util.Scanner;
class Checknum{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int count=0;
    System.out.println("Enter the number to check");
    int num=s.nextInt();
    int arr[]={1,2,3,4,5,6};
    for(int i=0;i<arr.length;i++){
      if(arr[i]==num){
        System.out.println("number is present in "+i+"th position");
        count++;
      }
    }
    if(count==0){
      System.out.println("the number is not present");
    }
  }
}
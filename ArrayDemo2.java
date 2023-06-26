import java.util.Scanner;
class ArrayDemo2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("Enter the array elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("the array elements are:");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    
  }
}
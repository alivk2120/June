import java.util.Scanner;
class Least{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={4,6,8,3,2,5,7};
    int temp=0;
    for(int i=0;i<arr.length;i++) {
      for(int j=i+1;j<arr.length;j++) {
        if(arr[i]>arr[j]) {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println("Second highest value:"+arr[arr.length-2]);
    System.out.println("Second least value:"+arr[1]);
       }
  }
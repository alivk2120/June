class ArrrevDemo{
  public static void main(String args[]){
    int arr[]={12,65,43,65,87,98};
    int rev[]=new int[100];
    System.out.println("Array before reversing");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println(" ");
    for(int i=0;i<arr.length;i++){
      int j=arr[arr.length-1-i];
      rev[i]=j;
    }
    System.out.println("Array elements after reversing");
    for(int i=0;i<arr.length;i++){
      System.out.print(rev[i]+" ");
    }
    System.out.println(" ");
  }
}
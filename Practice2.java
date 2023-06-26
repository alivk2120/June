class Practice2{
  public static void main(String args[]){
    int arr[]={12,23,33,43};
    try{
    System.out.println(arr[6]);
    }
   catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
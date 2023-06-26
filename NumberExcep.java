class NumberExcep{
  public static void main(String args[]){
    String str="asdfrt";
    try{
    int num=Integer.parseInt(str);
    System.out.println(num);
    }
    catch(NumberFormatException e){
      System.out.println(e);
    }
    System.out.println("Hi, helo");
  }
}
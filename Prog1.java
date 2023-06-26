//Write a Java program that takes a string as input and prints its length using the length() method.
//class Prog1{
  //public static void main(String args[]){
    //String str="Hi hello";
    //System.out.println("lenth of the string is:"+str.length());
  //}
//}

class Prog1{
  public static void main(String args[]){
    String str="Hi Hello";
    int count=0;
    char ch[]=str.toCharArray(100);
    for(int i=0;i<ch.length;i++){
      count++;
    }
    System.out.println(count);
  }
}
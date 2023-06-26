//String Concatenation: Create a class called StringUtils with overloaded methods for concatenating strings. Implement methods such as concat(String str1, String str2), concat(String str1, String str2, String str3), concat(String str1, String str2, String str3, String str4), and so on. Test the methods by calling them with different arguments
class StringUtils{
  void concat(String str1,String str2){
    System.out.println(str1+str2);
  }
  void concat(String str1,String str2,String str3){
    System.out.println(str1+str2+str3);
  }
  void concat(String str1,String str2,String str3,String str4){
    System.out.println(str1+str2+str3+str4);
  }
}
class Str{
  public static void main(String args[]){
    StringUtils s=new StringUtils();
    s.concat("Ali","Bhai");
    s.concat("Hi","Hello","when");
    s.concat("Who","are","you","man");
  }
}
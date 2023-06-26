class Vowels{
  public static void main(String args[]){
    String str="america is good unless it is bad";
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        System.out.print(str.charAt(i));
      }
    }
    System.out.println(" ");
  }
}
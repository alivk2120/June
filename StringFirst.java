class StringFirst{
  public static void main(String args[]){
    String str="Ahammad ali";
    char search='l';
    for(int i=0;i<str.length();i++){
      if(search==str.charAt(i)){
        System.out.println("The character "+search+" is found at "+i+" th position");
        break;
      }
    }
  }
}
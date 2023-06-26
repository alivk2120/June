class DigitSum{
  public static void main(String args[]){
    int num=1234;
    int dig=0,rev=0,sum=0;
    while(num!=0){
      dig=num%10;
      sum=sum+dig;
      num=num/10;
      
    }
    System.out.println(sum);
  }
}
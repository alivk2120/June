class FirstandLast{
  public static void main(String args[]){
    int num=12345678;
    int dig=0,rev=0,sum=0;
    int digit=num,count=0;
    dig=num%10;
    sum=sum+dig;
    while(num!=0){
      num=num/10;
      count++;
    }
    for(int i=0;i<count-1;i++){
      digit=digit/10;
    }
    sum=sum+digit;
    System.out.println(sum);
  }
}
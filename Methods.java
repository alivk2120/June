class Method{
  void add(int a,int b){
    int sum=a+b;
  }
}
class OverridingDemo extends Method{
  void add(int a,int b){
    int sum=a+b;
    System.out.println(sum);
  }
}
class Methods{
  public static void main(String args[]){
    OverridingDemo o=new OverridingDemo();
    o.add(2,6);
  }
}
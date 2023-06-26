//Math Operations: Create a class called MathOperations with overloaded methods for performing basic math operations. Implement methods such as add(int a, int b), add(double a, double b), subtract(int a, int b), subtract(double a, double b), multiply(int a, int b), multiply(double a, double b), divide(int a, int b), and divide(double a, double b). Test the methods by calling them with different arguments.
class MathOperations{
  void add(int a,int b){
    int sum=a+b;
    System.out.println("Sum is:"+sum);
  }
  void add(double a,double b){
    double sum=a+b;
    System.out.println("Sum is:"+sum);
  }
  void subtract(int a,int b){
    int sub=a-b;
    System.out.println("Difference is:"+sub);
  }
  void subtract(double a,double b){
    double sub=a-b;
    System.out.println("Difference is:"+sub);
  }
  void multiply(int a,int b){
    int mul=a*b;
    System.out.println("Product is:"+mul);
  }
  void multiply(double a,double b){
    double mul=a*b;
    System.out.println("Product is:"+mul);
  }
  void divide(int a,int b){
    int div=a/b;
    System.out.println("answer is:"+div);
  }
  void divide(double a,double b){
    double div=a/b;
    System.out.println("answer is:"+div);
  }
}
class Math{
  public static void main(String args[]){
    MathOperations m=new MathOperations();
    m.add(2,6);
    m.add(2.0,7.0);
    m.subtract(9,3);
  }
}
import java.util.Scanner;
class Fibonacci {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of terms in the Fibonacci series: ");
    int num= s.nextInt();
    int a = 0;
    int b = 1;
    System.out.print("Fibonacci series: " +a+ " " +b+ " ");
    for (int i = 3; i <= num; i++) {
      int c = a + b;
      System.out.print(c+ " ");
      a = b;
      b = c;
        }
    }
}
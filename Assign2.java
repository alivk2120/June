/*Write a program that prompts the user to enter a URL. The program should validate the URL based on the following criteria:
The URL must start with "http://" or "https://".
The URL must contain a domain name (e.g., "example.com").*/
import java.util.Scanner;
public class Assign2{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a URL: ");
    String url = s.nextLine();
    if (validateURL(url)) {
      System.out.println("Valid URL!");
    }
    else {
      System.out.println("Invalid URL!");
        }
    }
  public static boolean validateURL(String url) {
    if (url.startsWith("http://") || url.startsWith("https://")) {
      if(url.endsWith(".com"))
        return true;
    }
  }
        return false;
    }
}
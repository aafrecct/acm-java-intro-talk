package utils;
import java.util.Scanner;

public class Utils {
  static Scanner pauser = new Scanner(System.in);  
  
  public static void pause() {
    System.out.println("Press enter to continue...");
    pauser.nextLine(); 
  }
}

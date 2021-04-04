package palindrom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
              Scanner in = new Scanner(System.in);
              System.out.println("Enter your string");
              String input_string = in.nextLine();
              input_string =  input_string.replaceAll("\\s", "");
              StringBuffer work_string = new StringBuffer();

              for (int i = input_string.length() - 1; i >= 0; i--) {
                  char ch = input_string.charAt(i);
                  work_string.append(ch);
              }

              if (input_string.equalsIgnoreCase(work_string.toString())) {
                  System.out.println("Yes, it is a palindrom.");
              } else {
                  System.out.println("No, it is not a palindrom.");
              }
    }
}

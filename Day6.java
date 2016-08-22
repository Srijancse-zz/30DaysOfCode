import java.io.*;
import java.util.*;


public class Solution {

      public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
          int length = scan.nextInt();
          int[] array = new int[length];

          for (int i = 0; i < length; i++) {
              array[i] = scan.nextInt();
          }

          String result = "";

          for (int i = array.length - 1; i >= 0; i--) {
              result = result + array[i] + " ";
          }

          System.out.println(result);
      }
  }

// skip duplicate and count the length of string


import java.util.*;
public class Duplicate {
 public static void main(String[] args) {
  String str = "ABCABDEIJIKLZTZ";
  System.out.println("The given string is: " + str);
  System.out.println("After removing duplicates characters the new string is: " + remDup(str));
 }
 private static String remDup(String s) {
  char[] arr = s.toCharArray();
  String s1 = "";
  for (char value: arr) {
   if (s1.indexOf(value) == -1) {
    s1 += value;
   }
  }
  return s1;
 }
}




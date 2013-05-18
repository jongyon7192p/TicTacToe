import java.io.IOException;
import java.util.Scanner;

public class ex3
{
 public static void main(String[]args)
 {
  try
  {
   printPalindrome();
  }
  catch (Exception e)
  {
   System.out.println("Invalid input.");
  }
 }

 public static void printPalindrome
 {
  Scanner s = new Scanner(System.in);
  System.out.println("Type a string to check if it's a palindrome.");
  String p = s.next();
  int check = 0;
  for (int x = 0; x<(p.length/2);x++)
  {
   if (p.charAt(x)!=p.charAt(p.length-x-1))
   {
    System.out.println("This is not a palindrome.");
	check++;
	x=p.length;
   }
  }
  if (check==0)
  {
       System.out.println("This is a palindrome.");
  }
 }
 
 private static int readValue(String prompt)  throws IOException
 {
  if (!prompt.isEmpty())
  {
   System.out.println(prompt);
  }
  Scanner scanner = new Scanner(System.in);
  return scanner.nextInt();
 }
}
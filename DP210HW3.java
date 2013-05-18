import java.io.IOException;
import java.util.Scanner;

public class DP210HW3
{
 public static void main(String[]args)
 {
  try
  {
   int vert = readValue("Vertical?");
   int horz = readValue("Horizontal?");
   printGrid(vert, horz);
   
   int x1 = readValue("x cooredinate of 1st point?");
   int y1 = readValue("y cooredinate of 1st point?");
   int x2 = readValue("x cooredinate of 2nd point?");
   int y2 = readValue("y cooredinate of 2nd point?");
   distance(x1, y1, x2, y2);
   
   String s = readString("Type a string to print vertically.");
   vertical(s);
   
   String s2 = readString("Type a string to print in reverse.");
   reverse(s2);
   
   inputBirthday();
   
   int n = readValue("Give an integer.");
   double series = fractionSum(n);
   System.out.println(series);
   
   int a = readValue("Give a first integer.");
   int b = readValue("Give a second integer.");
   printRange(a, b);
   
   /*smallestLargest();
   
   int grade = readValue("Enter grade.");
   if (grade<0 || grade>4)
   {
    System.out.println("Grade is beyond bounds.")
   }
   else
   {
    double numGrade = getGrade(grade);
	System.out.println(numGrade);
   }*/
  
  }
  catch (Exception e)
  {
   System.out.println("Invalid input.");
  }
 }
 public static void printGrid(int vert, int horz)
 {
  for (int x=1; x<=vert; x++)
  {
   for (int y=x; y<=(vert*horz); y+=vert)
   {
    System.out.print(y+" ");
   }
   System.out.println();
  }
 }
 public static void distance(int x1, int y1, int x2, int y2)
 {
  double d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
  System.out.println(d);
 }
 public static void vertical(String s)
 {
  for (int ch=0; ch<s.length(); ch++)
  {
   System.out.println(s.charAt(ch));
  }
 }
 public static void reverse(String s2)
 {
  for  (int ch=s2.length()-1; ch>=0; ch--)
  {
   System.out.print(s2.charAt(ch));
  }
  System.out.println();
 }
 public static void inputBirthday()
 {
  Scanner s = new Scanner(System.in);	
  System.out.println("On what day of the month were you born?");
  int day = s.nextInt();
  System.out.println("What is the name of the month in which you were born?");
  String month = s.next();
  System.out.println("During what year were you born?");
  int year = s.nextInt();
  System.out.println("You were born on "+month+" "+day+", "+year+". You're mighty old!");
 }
 public static double fractionSum(int n)
 {
  double series=1;
  for (double i=2; i<=n; i++)
  {
   series=series+(1/i);
  }
  return series;
 }
 public static void printRange(int a, int b)
 {
  if (a<b)
  {
   System.out.print("["+a);
   for(int c=(a+1); c<=b; c++)
   {
    System.out.print(","+c);
   }
   System.out.print("]");
  }
  else if (a>b)
  {
   System.out.print("["+a);
   for(int c=(a-1); c>=b; c--)
   {
    System.out.print(","+c);
   }
   System.out.print("]");
  }
  else
  {
   System.out.print("["+a+"]");
  }
 }
 /*public static void smallestLargest()
 {
  Scanner s = new Scanner(System.in);
  System.out.println("How many numbers do you want to enter?");
  int howMany = s.nextInt();
  for (int x=1; x<=howMany;x++)
  {
   System.out.println("Number "+1+": ");
   int num = s.nextInt();
   if ()
   {
    
   }
  }
 }
 public static double getGrade(int grade);
 {
  if (grade<60)
  {
   double numGrade = 0.0;
  }
  else if (grade<=62)
  {
   double numGrade = 0.7;
  }
  else if (grade>=95)
  {
   double numGrade = 4.0;
  }
  else
  {
   double numGrade = (grade-55)/10;
  }
  return numGrade;
 }*/
 
 private static int readValue(String prompt)  throws IOException
 {
  if (!prompt.isEmpty())
  {
   System.out.println(prompt);
  }
  Scanner scanner = new Scanner(System.in);
  return scanner.nextInt();
 }
 private static String readString(String prompt)  throws IOException
 {
  if (!prompt.isEmpty())
  {
   System.out.println(prompt);
  }
  Scanner scanner = new Scanner(System.in);
  return scanner.nextLine();
 }
}
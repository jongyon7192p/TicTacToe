import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Represents a tic tac toe board on the console, positions are shown below:
 * -------------
 * | 1 | 2 | 3 |
 * -------------
 * | 4 | 5 | 6 |
 * -------------
 * | 7 | 8 | 9 |
 * -------------
 *
 * An example board in mid play looks like this:
 * -------------
 * | X |   |   |
 * -------------
 * |   | O |   |
 * -------------
 * | O |   | X |
 * -------------
 *
 * @author Vinayak Rao
 *
 */
public class TicTacToe
{
    public enum Marker
    {
        EMPTY,
        X,
        O
    };

    private static Marker position1 = Marker.EMPTY;
    private static Marker position2 = Marker.EMPTY;
    private static Marker position3 = Marker.EMPTY;
    private static Marker position4 = Marker.EMPTY;
    private static Marker position5 = Marker.EMPTY;
    private static Marker position6 = Marker.EMPTY;
    private static Marker position7 = Marker.EMPTY;
    private static Marker position8 = Marker.EMPTY;
    private static Marker position9 = Marker.EMPTY;

    private static Marker turn = Marker.X;

    public static void main(String[] args)
    {
     Scanner scanner=new Scanner(System.in);
     System.out.println("We are playing TicTacToe. When asked to enter position, refer to map below.");
     System.out.println("-------------");
     System.out.println("| 1 | 2 | 3 |");
     System.out.println("-------------");
     System.out.println("| 4 | 5 | 6 |");
     System.out.println("-------------");
     System.out.println("| 7 | 8 | 9 |");
     System.out.println("-------------");
     while (hasWon(turn)==false)
	 {
	  int pos=0;
	  if (pos!=0)
	  {
       switch (turn)
	   {
	    case X:
	    turn=Marker.O;
	    break;
	    case O:
	    turn=Marker.X;
	    break;
	   }
	  }
	  pos=getPosition(turn);
	  /*System.out.println("Player "+turn+", enter position.");
	  int pos=scanner.nextInt();
	  while (pos>9||pos<1)
	  {
	   System.out.println("Position "+pos+" is an invalid TicTacToe position. Try again.");
	   pos=scanner.nextInt();
	  }
	  Marker markerPos=getMarker(pos);
	  while (markerPos!=Marker.EMPTY)
	  {
	   System.out.println("Position "+pos+" is already filled. Try again.");
	   pos=scanner.nextInt();
	   markerPos=getMarker(pos);
	  }
	  System.out.println("Not an integer. Player "+turn+", enter an integer representing a position.");*/
	  markTheBoard(turn, pos);
      printBoard();
     }
	 System.out.println("Player "+turn+" won!");
    }
	
	public static int getPosition(Marker turn)
	{
	 Scanner scanner=new Scanner(System.in);
	 int pos;
     try
	 {
      System.out.println("Player "+turn+", enter position.");
      pos=scanner.nextInt();
	  Marker markerPos=getMarker(pos);
	  while (markerPos!=Marker.EMPTY)
	  {
	   System.out.println("Can't place a marker at position "+pos+". Try again.");
	   pos=scanner.nextInt();
	   markerPos=getMarker(pos);
	  }
	  return pos;
     }
	 catch (InputMismatchException e)
	 {
      System.out.println("Not an integer. Try again.");
	  return 0;
     }
	}
	
	

    /**
     * This method will print the board as shown in the above example.
     */

    public static void printBoard()
    {
     System.out.println("-------------");
     System.out.print("| ");
	 printSpace(position1);
	 System.out.print(" | ");
	 printSpace(position2);
	 System.out.print(" | ");
	 printSpace(position3);
	 System.out.print(" |\n");
     System.out.println("-------------");
     System.out.print("| ");
	 printSpace(position4);
	 System.out.print(" | ");
	 printSpace(position5);
	 System.out.print(" | ");
	 printSpace(position6);
	 System.out.print(" |\n");
     System.out.println("-------------");
     System.out.print("| ");
	 printSpace(position7);
	 System.out.print(" | ");
	 printSpace(position8);
	 System.out.print(" | ");
	 printSpace(position9);
	 System.out.print(" |\n");
     System.out.println("-------------");
    }

    public static Marker getMarker(int pos)
    {
     Marker m=position1;
     switch (pos)
     {
      case 1:
      m=position1;
      break;
      case 2:
      m=position2;
      break;
      case 3:
      m=position3;
      break;
      case 4:
      m=position4;
      break;
      case 5:
      m=position5;
      break;
      case 6:
      m=position6;
      break;
      case 7:
      m=position7;
      break;
      case 8:
      m=position8;
      break;
      case 9:
      m=position9;
      break;
     }
	 return m;
    }
	
	public static void printSpace(Marker m)
	{
	 if (m==Marker.EMPTY)
      {
	   System.out.print(" ");
      }
	 else
	  {
	   System.out.print(m);
	  }
	}

    /**
     * Checks if a particular player has won.
     *
     * @param m The player to check
     * @return true if the player won, false if not
     */
    public static boolean hasWon(Marker m)
    {
	 boolean win=false;
	 for (int x=1; x<4; x++)
	 {
	  if(getMarker(x)==m&&getMarker(x+3)==m&&getMarker(x+6)==m)
	  {
	   win=true;
	  }
	 }
	 for (int x=1; x<8; x+=3)
	 {
	  if(getMarker(x)==m&&getMarker(x+1)==m&&getMarker(x+2)==m)
	  {
	   win=true;
	  }
	 }
	 if(getMarker(1)==m&&getMarker(5)==m&&getMarker(9)==m||getMarker(3)==m&&getMarker(5)==m&&getMarker(7)==m)
	 {
	  win=true;
	 }
     return win;
    }

    /**
     * Checks if the board is full with no winner
     * @return true if the board is full with no winner, false otherwise
     */
    public static boolean isTie()
    {
	 boolean tie=false;
     return tie;
    }

    /**
     * Mark the given position with the given marker
     * @param m The marker of the player given
     * @param pos The position that we are marking
     */

    public static void markTheBoard(Marker m, int pos)
    {
     switch (pos)
     {
      case 1:
      position1=m;
      break;
      case 2:
      position2=m;
      break;
      case 3:
      position3=m;
      break;
      case 4:
      position4=m;
      break;
      case 5:
      position5=m;
      break;
      case 6:
      position6=m;
      break;
      case 7:
      position7=m;
      break;
      case 8:
      position8=m;
      break;
      case 9:
      position9=m;
      break;
	 }  
    }
}
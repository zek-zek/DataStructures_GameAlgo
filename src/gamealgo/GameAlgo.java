package gamealgo;

import java.util.Scanner;

public class GameAlgo
{
    private static int choiceNumber;
    private static boolean isPlaying = true;
    private static Scanner scan;
    
    public static void main(String[] args) throws InterruptedException
    {
       scan = new Scanner(System.in);
       
        OUTER:
        while (isPlaying)
        {
            System.out.print("\n\n"
                    + "Welcome to league of legends\n"
                    + "=====================================================\n"
                    + "1 - Start Game\n"
                    + "2 - Exit\n"
                    + "=====================================================\n"
                    + "Input: ");
            
            String input = scan.next();
            
            if (tryParse(input))
            {
                choiceNumber = Integer.parseInt(input.trim());
                switch (choiceNumber)
                {
                    case 1:
                        System.out.print("\nLoading..");
                        for(int i = 0; i <= 6; i++)
                        {
                            Thread.sleep(500);
                            System.out.print(".");
                        }
                        break;
                    case 2:
                        break OUTER;
                    default:
                        System.out.println("Please input digits 1 or 2 only");
                        break;
                }
            }
            else
            {
                System.out.println("Please input digits 1 or 2 only");
            }
        }
    }
    
    static boolean tryParse(String value)
    {
        try
        {
            Integer.parseInt(value);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
}

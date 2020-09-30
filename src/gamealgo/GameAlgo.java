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
                    + "Welcome to kepap legends\n"
                    + "=====================================================\n"
                    + "1 - Start Game\n"
                    + "2 - Exit\n"
                    + "=====================================================\n"
                    + "Input: ");
            
            String input = scan.next().trim();
            
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
                        
                        System.out.print("\n\n"
                                + "Choose your hero: \n"
                                + "=====================================================\n"
                                + "1 - Nayeon\n"
                                + "2 - Chaeyoung\n"
                                + "3 - Mina\n"
                                + "4 - Back to Main Menu\n"
                                + "=====================================================\n"
                                + "Input: ");
                        
                        input = scan.next().trim();
                        if(tryParse(input))
                        {
                            choiceNumber = Integer.parseInt(input.trim());
                            switch(choiceNumber)
                            {
                                case 1:
                                    if(finalChampion("Nayeon"))
                                    {
                                        
                                    }
                                    
                                    break;
                            }
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
    
    private static Boolean finalChampion(String heroName)
    {
        System.out.print("\nYou choose " + heroName + ", is it your final choice?");
        scan = new Scanner(System.in);
        String isFinal = scan.next();
        
        if(isFinal.equalsIgnoreCase("yes"))
        {
            return true;
        }
        else if(isFinal.equalsIgnoreCase("no"))
        {
            return false;
        }
        
        return false;
    }
    
    private static boolean tryParse(String value)
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

import java.util.logging.*;

class Main 
{
    // adds an integer variable having value 5 
    // and a double variable having value 6
    public void add(Logger logger)
    {
        int a = 5; 
        double b = 6d; // it is good practice to keep d 
        double result = a + b; 
        logger.log(Level.INFO,"Result {0}.", result);
    }

    // prints a patter on the screen 
    public void pattern1()
    {
        for (int i = 1; i < 5; ++i)
        {
            for (int j = 0; j < i; ++j)
            {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    // Take length & breadth of a rectangle and check 
    // whether it is a square or not 
    public void square(double length, double breadth, Logger logger)
    {
        if (length == breadth)
        {
            logger.log(Level.INFO, "Square");
        }
        else
        {
            logger.log(Level.INFO, "Not a Square");
        }
    }
    

    //printing a pattern
    public void pattern2()
    {
        for (int i = 1; i <=3; ++i)
        {
            for (int j = 0; j < 3-i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 2; i >= 1; i--) {
            for (int j = 3 - i; j > 0; j--) {
                System.out.print(' ');
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void pattern3()
    {
        System.out.print('1'); 
        System.out.print('0'); 
        System.out.print('1');
        System.out.print('0');
        System.out.print('1');
        System.out.print('0');
        System.out.print('1');  
        
        for (int i = 0; i <= 3; i++) {
            for (int k = 0; k < (3-i) * 2 + 1; k++)
            {
                if (k % 2 == 0)
                {
                    System.out.print('1');
                }
                else
                {
                    System.out.print('0');
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Main main = new Main(); 
        
        // create a Logger 
        Logger logger = Logger.getLogger(Main.class.getName());
        main.add(logger);
        main.pattern1();
        main.square(9.01, 9.0, logger);  // Not a square
        main.pattern2();
        main.pattern3(); 
    }
}
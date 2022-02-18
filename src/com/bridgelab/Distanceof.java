package com.bridgelab;

import java.util.Scanner; // import scanner class

class Distanceof{

    static void calculate(int x, int y)
    {
        System.out.println("distance is " + Math.pow((x * x + y * y), 0.5));
    }


// main method

    public static void main(String[] args) {

        try {                                             // using try nd catch block
            Scanner s = new Scanner(System.in);
            
            System.out.println("Enter value for x");     //try is code to be tested for error while it is being executed
            
            int x = s.nextInt();
            
            System.out.println("Enter value for y");
            
            int y = s.nextInt();
            
            calculate(x, y);
        }
        
        catch (Exception e)                                  // code to b executed,if an error occura in the try block
        {
            System.out.println("Enter integer");
        }
    }
}

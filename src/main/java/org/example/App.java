package org.example;

import org.example.fibonacci.FibonacciSeries;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        FibonacciSeries fs = new FibonacciSeries();
        System.out.println( "Fibonacci Series" );
        for (int i = 0; i < num; i++) {
            System.out.print(fs.fibonacci(i)+" ");
        }

    }
}

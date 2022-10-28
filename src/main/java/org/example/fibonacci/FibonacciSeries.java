package org.example.fibonacci;

public class FibonacciSeries {

    public int fibonacci(int n) {
        if(n == 0){
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        else if(n > 0)
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
        else {
            return -1;
        }
    }

}

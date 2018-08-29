package Interview.NStairs;


// https://www.youtube.com/watch?v=5o-kdjv7FD0&index=1&list=PLBZBJbE_rGRVnpitdvpdY9952IsKMDuev

public class Main {

    // A simple recursive program to find n'th fibonacci number
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    // Returns number of ways to reach s'th stair
    static int countWays(int s)
    {
        return fib(s + 1);
    }

    public static void main(String[] args)
    {
        int s = 4;
        System.out.println("Number of ways = "+ countWays(s));
    }
}




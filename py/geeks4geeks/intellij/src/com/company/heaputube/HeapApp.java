package com.company.heaputube;
import com.company.A3Bajuelos.Heap;

import java.util.Scanner;

/**
 * @author Sesh Venugopal. New Jersey. 2013
 */

// https://www.youtube.com/watch?v=LhhRbRXhB40
// https://www.youtube.com/watch?v=W81Qzuz4qH0

public class HeapApp
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Heap<Integer> hp = new Heap<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter next int, 'done' to stop: ");
        String line = sc.next();

        while (!line.equals("done"))
        {
            hp.insert(Integer.parseInt(line));
            System.out.println(hp);
            System.out.print("Enter next int, 'done' to stop: ");
            line = sc.next();
        }

        while (!hp.isEmpty())
        {
            int max = hp.delete();
            System.out.println(max + " " + hp);
        }
    }
}
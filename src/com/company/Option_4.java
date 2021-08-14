package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Option_4 {
//TODO Option 4: Is it a Factor --[]
public static void run(){
    //--- --- --- --- --- ---
    //first find the facter of the num
    //second check if the second is a factor of it

    System.out.print ("Please Enter the Base: ");
    int f = Input.input.nextInt ();
    System.out.print ("Please Enter the Potential Factor: ");
    int p = Input.input.nextInt ();

    ArrayList<Integer> factors = new ArrayList<Integer> ();

    while (f % 2 == 0) {
       factors.add ( 2 );
        f /= 2;
    }

    // n must be odd at this point.  So we can
    // skip one element (Note i = i +2)
    for (int i = 3; i <= Math.sqrt(f); i += 2) {
        // While i divides n, print i and divide n
        while (f % i == 0) {
            factors.add ( i );
            f /= i;
        }
    }

    // This condition is to handle the case whien
    // n is a prime number greater than 2
    if (f > 2)
        factors.add ( f );

    System.out.println ( factors);
    }

    public static void main(String[] args) {
        run ();
    }
}

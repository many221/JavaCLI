package com.company;

public class Option_1 {
    //TODO Option 1: Factorial Calculator --[x]


    public static void run(){
        //--- --- --- --- --- ---
        System.out.print ("--- --- --- --- --- ---\n" +
                            "Please enter a number to factoralize\n" +
                            "Selection: ");
        int num = Input.input.nextInt ();
        System.out.println ("--- --- --- --- --- ---");
        System.out.println ("Factorial \"" + num +"!\" = \"" + recur ( num ) + "\"\n"+
                            "--- --- --- --- --- ---");


    }

    static int recur( int number) {
    if(number <= 2 ){
        return number;
    }
    return number * recur ( number - 1 );}
}

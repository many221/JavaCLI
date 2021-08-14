package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Option_2 {
    //TODO Option 2: Title Case A String --[x]
    public static void run(){
        //--- --- --- --- --- ---
        System.out.print ("--- --- --- --- --- ---\n" +
                          "Please enter a Sentence to case.\n" +
                          "(e.i. hello world -> Hello World) \n"+
                          "Sentence: ");


        Input.input.nextLine ();
        String str = Input.input.nextLine ().toLowerCase ();
        String[] strArr = str.split ( " ");
        String newStr = "";
        for (int i = 0; i < strArr.length; i++) {

            newStr += strArr[i].substring (0,1).toUpperCase () + strArr[i].substring (1) + " ";

        }
        //output log
        System.out.println ("--- --- --- --- --- ---\n"+"Cased Sentence: " +newStr.trim ()+"\n--- --- --- --- --- ---");


    }

}

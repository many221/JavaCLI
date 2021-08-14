package com.company;

import java.util.Scanner;

public class Input {

//TODO Input & exit method --[x]
      static   Scanner input = new Scanner ( System.in );

      public static void yesNo(){

            System.out.print ( """
                    Would You Like To Continue With Another Program?
                    --- --- --- --- --- ---
                    Yy|Nn:\s""" );
            String yn = input.next ();
            switch (yn){
                  case "Y","y","Yes","yes" -> System.out.println ("--- --- --- --- --- ---");
                  case "N","n","No","no" -> {Menu.check = false;
                        System.out.println ("--- --- --- --- --- ---\nYou have chosen to end Manny's CLI!\nBYE-BYE \uD83D\uDE04 \uD83D\uDC4B \n--- --- --- --- --- ---");
                  }
            }
      }
}

package com.company;

import java.util.Arrays;

public class Option_3 {
    //TODO Option 3: PigLatin Converter --[x]
    /*
       Move the first letter of each word to the end of the word.

      Add "ay" to the end of the word.

      Words starting with a vowel (A, E, I, O, U) simply have "WAY" appended to the end.

    */
    public static void run(){
        //--- --- --- --- --- ---
        System.out.print ("--- --- --- --- --- ---\n" +
                          "Please enter a Sentence to to translate to pig latin.\n" +
                          "(e.i. Cats are great pets. -> Atscay areway reatgay etspay) \n"+
                          "Sentence: ");

        Input.input.nextLine ();
        String str = Input.input.nextLine ();
        String[] strArr = str.split ( " ");
        String encoded = "";

        for (int i = 0; i < strArr.length; i++) {

            boolean vowelCheck =  strArr[i].matches ( "^[aeiouAIEOU].*" );

            if (vowelCheck){
                strArr[i] = flipper ( strArr[i] );
                strArr[i] += "way";
            }else strArr[i] = flipper ( strArr[i] );
            strArr[i] += "ay";

            encoded += strArr[i] + " ";
        }


        System.out.println (encoded.trim ());


    }

    static String flipper( String val){


        char[] chArr = val.toCharArray ();
        int lastIndex = chArr.length -1;
        char temp = chArr[0];
        chArr[0]= chArr[lastIndex];
        chArr[lastIndex]= temp;




        String flipped = new String (chArr);

    return flipped;
    }

    public static void main(String[] args) {
      run ();
    }
}

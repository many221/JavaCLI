package com.company;

public class Menu {

    static boolean check = true;

    public static void start(){

        System.out.println ("--- --- --- --- --- ---\nWelcome to Manny's CLI!\n--- --- --- --- --- ---");

        while (check){

            System.out.print ( """
                    Please Choose an option from below\s
                    -↓---↓---↓---↓---↓---↓-
                    Option 1: Factorial Calculator\s
                    Option 2: Title Case A String\s
                    Option 3: PigLatin Converter\s
                    Option 4: Is it a Factor?\s
                    Option 5: Exit Program\s
                    Option:\s""" );

            byte op = Input.input.nextByte ();

            switch (op){

                case 1 -> {
                    Option_1.run ();
                    Input.yesNo ();
                }
                case 2 -> {
                    Option_2.run();
                    Input.yesNo ();
                }
                case 3,4 -> {
                    System.out.println ("--- --- --- --- --- ---\n" +
                                        "Program In Progress" +
                                        "\n--- --- --- --- --- ---");
                    Input.yesNo();
                }
                case 5 -> {
                    check = false;
                    System.out.println ("--- --- --- --- --- ---\n" +
                                        "You Have Chosen To End Manny's CLI!\n" +
                                        "BYE-BYE \uD83D\uDC4B \uD83D\uDE04" +
                                        "\n--- --- --- --- --- ---");
                }
                default -> System.out.println ("--- --- --- --- --- ---\n" +
                                               "Please Enter A Valid Option" +
                                               "\n--- --- --- --- --- ---");
            }

        }
    }
}

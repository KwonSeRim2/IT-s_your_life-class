package test.D0416;

import java.util.Scanner;

public class Input {

    private static Scanner scammer = new Scanner(System.in);

    public static String read(String title){
        System.out.print(title);

        String input = scammer.nextLine();

        return input;
    }

    public static String read(String title, String defaultValue){
        System.out.print(title+"("+defaultValue+"): ");

        String input = scammer.nextLine();

        if(input.trim().equals("")){
            return defaultValue;
        }else {
            return input;
        }
    }

    //-----------------------------------------------------------

    public static int readInt(String title){
        System.out.print(title);

        int input = scammer.nextInt();
        scammer.nextLine();

        return input;
    }

    //------------------------------------------------------------

    public static boolean confirm(String title, boolean defaultValue){
        String yn;

        if(defaultValue == true){
             yn = "(Y/n):";
        }else {
             yn = "(y/N):";

        }

        System.out.print(title+yn);


        String input = scammer.nextLine();


        if (input.trim().equals("")){
            return defaultValue;

        }
            switch (input.trim()){
                case "y":
                case "Y":
                    return true;

                case "N":
                case "n":
                    return false;
            }


        return defaultValue;
    }

    public static boolean confirm(String title){
        return confirm(title, true);
    }
}

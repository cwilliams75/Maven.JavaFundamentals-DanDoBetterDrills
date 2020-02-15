package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld(){


        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        // variable type, then variable name, then assign value
        String x = firstSegment;
        String y = secondSegment;
        String result = x +  y;

        return result;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        int x = firstSegment;
        //String first = "" + firstSegment;
        String y = secondSegment;
        String result = x + y;

        return result;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
//        String result = "";
//       for(int i = 0; i < 3; i++){
//           result = result + input.charAt(i);
//       }
//        return result;

       return input.substring(0,3);
    }

    /**
     * @param given a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String given){
          // two expressions below
           // String result = "";
            Integer length = given.length();
            //for(int i = length -3; i < length; i++) {
              //  result = result + given.charAt(i);
           // }

        return given.substring(length -3);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        if (inputValue.equals(comparableValue)) {

            return true;
        }
        else
            return false;

    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
       // checking to find the string is "even" in length
        if (inputValue.length() % 2 == 0){
            return inputValue.charAt(inputValue.length() /2 -1);
        }
            else{

            return inputValue.charAt(inputValue.length() /2);
        }

    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
//Character.toString(spaceDelimitedString.charAt(0) This will return the first character in a string
          String[] firstword =  spaceDelimitedString.split(" ");


        return firstword[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] secondword =  spaceDelimitedString.split(" ");

        return secondword[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
//        char[] input = stringToReverse.toCharArray();
//        char[]reverse = new char[stringToReverse.length()];
//        int Counter = 0;
//        for(int i = stringToReverse.length()-1; i >= 0; i--){
//           reverse[Counter] = input[i];
//           Counter++;
//        }
        char[] input = stringToReverse.toCharArray();
        String reverse = "";
        int Counter = 0;
        for(int i = stringToReverse.length()-1; i >= 0; i--){
            reverse += input[i];
        }

        return reverse;
    }
}

package kata.RomanNumerals;

import java.util.*;

public class RomanNumerals {
    private static final Map<Character, Integer> ROMAN_NUMERALS_MAP = Map
            .of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public boolean isValidNumeral(String numeral) {
        String[] validNumerals = {"I", "V", "X", "L", "C", "D", "M"};
        String formattedNumeral = numeral.toUpperCase();

        // if the input numeral is blank or empty
            // return false

        // Iterate over each character in the numeral
            // If the character is not present in the set of valid characters
            // Return false indicating invalid numeral has been entered

        // If the character is a valid character,
            // Check character sequences adhere to subtraction rules (e.g. "IIII" is invalid, should be "IV")
            // If such a sequence is found, return false

        // return true (given all checks pass and last line is reached)

        throw new IllegalArgumentException("Remove this line when adding implementation");
    }

    public String convertIntToRoman(int number) {
        if (number < 1 || number > 3000) {
            throw new IllegalArgumentException("Invalid input. Number MUST be between 0 and 3000.");
        }

        StringBuilder romanNumeral = new StringBuilder();

        // if input is exactly divisible by the largest numeral value
        // return single numeral
        // else
        // Find the largest factor of the given number (less than input)
        // Subtract value of numeral from given number
        // Append numeral to output
        // Repeat process until given number reaches 0

        // Return completed output string

        return romanNumeral.toString();
    }

    public int convertRomanToInt(String numeral) {
        // Get number from numeral using ROMAN_NUMERALS_MAP and add to array of numbers

        // Iterate over array items in reverse order

        // if current item is bigger than preceding item
            // subtract from output value
        // else
            // add to output value

        if (numeral.isBlank() || numeral.isEmpty()) {
            throw new IllegalArgumentException("Invalid input. Numeral MUST NOT be blank or empty.");
        }

        int totalValue = 0;

        return totalValue;
    }
}
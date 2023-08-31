package kata.RomanNumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {
    private final RomanNumerals ROMAN_NUMERALS = new RomanNumerals();

    @Test
    public void checkZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            ROMAN_NUMERALS.convertIntToRoman(0);
        });
    }

    @Test
    public void checkNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            ROMAN_NUMERALS.convertIntToRoman(-1);
            ROMAN_NUMERALS.convertIntToRoman(-2);
            ROMAN_NUMERALS.convertIntToRoman(-3);
        });
    }

    @Test
    public void checkAboveThreeThousandThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            ROMAN_NUMERALS.convertIntToRoman(3001);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "TestData/RomanNumeralsTestCases.csv")
    public void checkIntegerReturnsCorrespondingNumeral(int inputNumber, String expectedNumeral) {
        String actualNumeral = ROMAN_NUMERALS.convertIntToRoman(inputNumber);

        assertEquals(expectedNumeral, actualNumeral);
    }

    @Test
    public void checkEmptyStringThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            ROMAN_NUMERALS.convertRomanToInt("");
        });
    }

    @Test
    public void checkInvalidStringThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            ROMAN_NUMERALS.convertRomanToInt("null");
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "TestData/RomanNumeralsTestCases.csv")
    public void checkNumeralReturnsCorrectValue(int expectedNumber, String inputNumeral) {
        assertEquals(expectedNumber, ROMAN_NUMERALS.convertRomanToInt(inputNumeral));
    }
}
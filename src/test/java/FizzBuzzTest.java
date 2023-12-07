import org.example.FizzBuzz;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    @ParameterizedTest
    @DisplayName("should return only the number")
    @CsvSource({"1,1", "2,2"})
    void shouldReturnNumbers(int input, String expected) {
        //Act
        String actual = FizzBuzz.compute(input);
        //Assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("should return fizz for multiples of 3 and buzz for multiple of 5")
    @CsvSource({"6,Fizz", "10,Buzz"})
    void shouldReturnFizzOrBuzz(int input, String expected) {
        //Act
        String actual = FizzBuzz.compute(input);
        //Assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("should return FizzBuzz for multiples of 5 and 3")
    @CsvSource({"60, FizzBuzz"})
    void shouldReturnFizzBuzz(int input, String expected) {
        //Act
        String actual = FizzBuzz.compute(input);
        //Assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("should return Fizz if number contains 3")
    @CsvSource({"13, Fizz", "33, FizzFizz"})
    void shouldReturnFizzCase2(int input, String expected) {
        //Act
        String actual = FizzBuzz.compute(input);
        //Assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("should return Buzz if number contains 5")
    @CsvSource({"52, Buzz", "55, BuzzBuzz"})
    void shouldReturnBuzzCase2(int input, String expected) {
        //Act
        String actual = FizzBuzz.compute(input);
        //Assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void shouldReturnList(int input, List<String> expected) {
        //Act
        List<String> actual = FizzBuzz.fizzBuzz(input);
        //Assert
        assertEquals(expected, actual);
    }

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(6, List.of("1", "2", "FizzFizz", "4", "BuzzBuzz", "Fizz"))
                );
    }
}

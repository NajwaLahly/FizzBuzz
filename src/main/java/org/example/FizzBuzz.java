package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final int FIZZNBR = 3;
    public static final int BUZZNBR = 5;

    static public List<String> fizzBuzz(int nbr) {
        List<String> result = new ArrayList<>();
        for (int i=1; i<=nbr; i++) {
            result.add(compute(i));
        }
        return result;
    }

    static public String compute(int nbr) {
        StringBuilder result = new StringBuilder();
        String[] splitedNbr = Integer.toString(nbr).split("");
        if(!isMultipleOf(nbr, FIZZNBR) && !isMultipleOf(nbr, BUZZNBR)
                && !containsValue(splitedNbr, FIZZNBR) && !containsValue(splitedNbr, BUZZNBR)) {
            return String.valueOf(nbr);
        }
        if (isMultipleOf(nbr, FIZZNBR))
            result.append(FIZZ);
        if (isMultipleOf(nbr, BUZZNBR))
            result.append(BUZZ);
        if (containsValue(splitedNbr, FIZZNBR))
            result.append(FIZZ);
        if (containsValue(splitedNbr, BUZZNBR))
            result.append(BUZZ);
        return result.toString();
    }

    static public boolean isMultipleOf(int nbr, int value) {
        return nbr % value == 0;
    }

    static public boolean containsValue(String[] splitedNbr, int value) {
        return Arrays.asList(splitedNbr).contains(String.valueOf(value));
    }
}

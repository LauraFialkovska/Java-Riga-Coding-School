package lesson_20220811;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        // ^[a-z0-9@]{6-255}$

        String patternString = "RigaCodingSchool";
        String patternText = "The story of the Riga Coding School: where we came from and where we are going, " +
                "from our origins in rigaCodingSchool to the principles guiding us into the future.";

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(patternText);

        System.out.println(matcher.find());

        String patternForAt = ".*@.*";
        String email = "testMe@gmail.com";
        System.out.println(Pattern.matches(patternForAt, email));
    }
}

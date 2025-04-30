package dsa.java8.practice.interviewProg;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfAllChar {

    public static void main(String[] args) {
        String input = "fhhsyuhwsyhghyswhsygwhs";

        Map<Character, Long> occCount=
        input.chars().
                mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting())
                );

        occCount.forEach((key, value) -> System.out.println(key+ ": "+value));


    }
}

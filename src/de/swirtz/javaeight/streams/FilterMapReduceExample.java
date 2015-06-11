package de.swirtz.javaeight.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Simon
 *         created on 11.06.2015.
 */
public class FilterMapReduceExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("String1", "String2", "String3", "string4");

        Optional<String> reduction = strings.stream().filter(s -> !s.contains("3")).map(s -> s.substring(s.length() - 1)).reduce((s1, s2) -> s1 + ", " + s2);
        System.out.println("Result of FMR operation: " + reduction.get());
    }
}

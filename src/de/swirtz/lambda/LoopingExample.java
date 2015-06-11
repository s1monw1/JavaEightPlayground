package de.swirtz.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Simon
 *         created on 20.03.2015.
 */
public class LoopingExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Albert", "Berthold", "Claus", "Dieter");

        strings.parallelStream().peek(System.out::println).mapToInt(String::length).forEach(System.out::println);

    }

}

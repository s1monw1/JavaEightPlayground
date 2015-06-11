package de.swirtz.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Simon
 *         created on 20.03.2015.
 */
public class LoopingExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("A", "B", "C", "D");

        //TODO IntelliJ suggestion
        strings.forEach(s-> System.out.println(s));

    }

}

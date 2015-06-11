package de.swirtz.javaeight.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Simon
 *         created on 20.03.2015.
 */
public class SimpleStreamExample {

    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("A", "B", "C", "D");
//        Consumer<String> c = System.out::println;
//        strings.forEach(c);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex", 30, 50000));
        personList.add(new Person("Klaus", 50, 80000));
        personList.add(new Person("Alex", 25, 40000));

        Consumer<Person> consumer = p -> p.salary = (int) ((double)p.salary * 1.1);
        personList.forEach(consumer);
        personList.forEach(System.out::println);

        Predicate<Person> salaryPred = p->p.salary>50000;

        System.out.println(personList.stream().filter(salaryPred).count());

        System.out.println(personList.stream().map(Person::getName).collect(Collectors.joining(" ; ")));

//        int totalSalary = personList
//                .parallelStream()
//                .mapToInt(Person::getSalary)
//                .sum();
//        System.out.println("Salary Sum: "+totalSalary);

        //Get count, min, max, sum, and average for numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = numbers
                .stream()
                .mapToInt((x) -> x)
                .summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

    }

    private static class Person {
        private String name;
        private int age;
        private int salary;

        public Person(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }
}

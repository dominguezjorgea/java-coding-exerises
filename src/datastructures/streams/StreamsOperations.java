package datastructures.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsOperations {

    public static List<String> filtering1(List<String> inputList){
        return inputList.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
    }

    public static List<Integer> filtering2(List<Integer> inputList){
        return inputList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> distinctNonRepeated(List<Integer> inputList){
        return inputList.stream().distinct().collect(Collectors.toList());
    }

    public static List<Integer> mapping1(List<String> inputList){
        return inputList.stream().map(String::length).collect(Collectors.toList());
    }
    public static Map<Integer, String> mapping2 (List<String> inputList){
        return inputList.stream().collect(Collectors.toMap(String::length, s -> s));
    }
    public static List<String> sorting (List<String> inputList){
        return inputList.stream().sorted().collect(Collectors.toList());
    }

    public static Integer reducedSum(List<Integer> inputList){
        return inputList.stream().reduce(0, Integer::sum);
    }
    public static String collecting (List<String> inputList){
        return inputList.stream().collect(Collectors.joining(", "));
    }

    public static Map<Integer, List<Person>>  grouping (List<Person> people){
        return people.stream().collect(Collectors.groupingBy(Person::getAge));
    }

    public static void forEachFunction(List<String> imputList){
        imputList.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Jorge", "Armando1", "Lady", "Johanna");
        System.out.println("Filtering words that start with J" + filtering1(inputList));
        System.out.println("Mapping with stream().map: " + mapping1(inputList));
        System.out.println("Mapping collect(Collectors.toMap: " + mapping2(inputList));
        System.out.println("Sorting: " + sorting(inputList));
        System.out.println("Reduced Sum: " + reducedSum(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(collecting(inputList));

        List<Person> personList = new ArrayList<>(Arrays.asList(new Person("Jorge", 38), new Person("Johanna", 34)));
        System.out.println("Grouped stream: " + grouping(personList));

        forEachFunction(inputList);

        List<Integer> inputListNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 15, 1, 2, 3, 4, 5, 15);
        System.out.println("module 2 filtered: " + filtering2(inputListNumbers));
        System.out.println("Non repeated: " + distinctNonRepeated(inputListNumbers));
    }

    public static class Person{
        public String name;
        public Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Integer getAge() {
            return age;
        }
        public void setAge(Integer age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

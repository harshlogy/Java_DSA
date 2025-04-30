package dsa.java8.practice.basics.Stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {
        List<String> ui_courses = Arrays.asList("HTML","CSS","bootstrap","jQuery");
        List<String> middleware_courses = Arrays.asList("JAVA","Python","dotnet","C++");
        List<String> db_courses = Arrays.asList("Oracle","MicrosoftSQL","MainframeDB");

        List<List<String>> ashok_it_corses = Arrays.asList(ui_courses,middleware_courses,db_courses);

        Stream<List<String>> stream = ashok_it_corses.stream();
        //stream.forEach((list)-> System.out.println(list));
        //stream.forEach(System.out::println);

        //Stream<Stream<String>> stream1 = stream.map(list -> (list.stream().map(str -> str.toUpperCase())));
        //stream1.forEach(System.out::println);


    }
}

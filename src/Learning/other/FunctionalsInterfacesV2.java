package Learning.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FunctionalsInterfacesV2 {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            reader
                    .lines()
                    .map(line -> line.split("[^a-zA-Zа-яА-Я0-9']+"))
                    .flatMap(Arrays::stream)
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue()
                            .reversed().thenComparing(Map.Entry.<String, Long>comparingByKey()))
                    .limit(10)

                    .map(Map.Entry::getKey)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
package Learning.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FunctionalsInterfaces {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in).useDelimiter(" ");
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String>  list = new ArrayList<>();

          Map<String, Long> map  =   reader
                    .lines()
                    .map(line -> line.split("[^a-zA-Zа-яА-Я0-9']+"))
                    .flatMap(Arrays::stream)
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


            Map<String, Long> finalMap = new LinkedHashMap<>();

            map.entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue()
                            .reversed().thenComparing(Map.Entry.<String, Long>comparingByKey()))
                    .limit(10)
                    .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));


            finalMap.forEach((x, y) -> System.out.println(x));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
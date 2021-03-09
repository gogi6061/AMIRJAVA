package Learning.aisd;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateArray {

    static Function<Integer, List<Integer>> createArray = (x -> Stream.iterate(1, chislo -> chislo + 1)
            .limit(x)
            .collect(Collectors.toList()));

    static Function<Integer, List<Integer>> createShuffledArray = (x -> {
        List<Integer> tmp = Stream.iterate(1, chislo -> chislo + 1)
                .limit(x)
                .collect(Collectors.toList());
        Collections.shuffle(tmp);
        return tmp;

    });


}

package stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        streamCollect();
    }

    private static void streamCollect() {
        Stream<String> stream = Stream.of("i", "love");
//        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));
//        Map<String, Integer> map = stream.collect(Collectors.toMap(t->t, String::length));
        Map<String, Integer> map = stream.collect(Collectors.toMap(t->t, t->t.length()));
        System.out.println(map);
    }
}

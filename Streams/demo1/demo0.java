package Youtube.abhishekverma.Streams.demo1;

import java.util.Random;
import java.util.stream.Stream;

public class demo0 {
    public static void main(String[] args) {
        Integer [] arr={10,20,30};
        Stream<Integer> stream= Stream.of(arr);

        Stream<Integer> stream1 = Stream.of(11,12,13);

        Stream<Integer> stream2 = Stream.generate(()-> new Random().nextInt()).limit(3);

        Stream<Integer> stream3=Stream.iterate(1,i->i<=3,i->i+1);
        stream3.forEach(System.out::println);

        Stream<Integer> stream4=Stream.empty();


    }
}

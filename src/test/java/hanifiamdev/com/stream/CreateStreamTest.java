package hanifiamdev.com.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        // Kode : Membuat Empty atau Single Stream
        Stream<String> emptyStream = Stream.empty();

        Stream<String> oneStream = Stream.of("Hanif");

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
    }

    @Test
    void testCreateStreamFromArray() {
        // Kode : Membuat Stream dari Array
        Stream<String> arrayStream = Stream.of("Hanif", "Orkhan", "Adiba");
        // Kode : Menjalankan Stream
        arrayStream.forEach(value -> {
            System.out.println(value);
        });

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 7, 8, 9, 10);
        // Kode : Menjalankan Stream , menggunakan method reference
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                "Hanif", "Orkhan", "Adiba"
        };
        Stream<String> streamFromArray = Arrays.stream(array);

        streamFromArray.forEach(value -> {
            System.out.println(value);
        });


    }

    @Test
    void testCreateStreamFromCollection() {
        // Kode : Membaut stream dari collection
        Collection<String> collection = List.of("Hanif", "Orkhan", "Adiba");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);
       //stringStream.forEach(System.out::println); // ERROR karena stream hanya bisa dioperasi satu kali proses , satu aliran saja
    }

    @Test
    void testCreateInfiniteStream() {
        // Kode : Membuat Infinite Stream
        Stream<String> stream = Stream.generate(() -> "Hanif");
        // stream.forEach(System.out::println); // infinite loop

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        //iterate.forEach(System.out::println); // ini infinite loop juga
    }
}

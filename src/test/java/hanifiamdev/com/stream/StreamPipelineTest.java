package hanifiamdev.com.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testcreateStreamPipiline() {

        // cara tanpa stream mpipilen ( INI JARANG DIGUNAKAN CARA SEPERTI INI !!!!)
        List<String> list = List.of("Hanif", "Orkhan", "Fachri");

        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipilineOk() {
        // Stream Pipiline
        List<String> list = List.of("Hanif", "Orkhan", "Fachri");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr. " + upper)
                .forEach(System.out::println);
    }
}

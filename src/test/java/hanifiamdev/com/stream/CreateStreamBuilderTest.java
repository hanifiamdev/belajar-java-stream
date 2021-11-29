package hanifiamdev.com.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Hanif");
        builder.add("Orkhan").add("Adiba");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamBuilderSimply() {
        Stream<Object> stream = Stream.builder()
                .add("Fachri").add("Mufhti").add("Amrullah").build();

        stream.forEach(System.out::println);
    }
}

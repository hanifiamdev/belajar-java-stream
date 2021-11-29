package hanifiamdev.com.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {

    @Test
    void testIntermediateOperation() {

        List<String> names = List.of("Hanif", "Fachri", "Orkhan");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                        return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {

        List<String> names = List.of("Hanif", "Fachri", "Orkhan");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                }).forEach(upper -> {
                    System.out.println(upper);
                });
    }
}

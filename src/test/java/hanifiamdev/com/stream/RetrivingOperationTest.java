package hanifiamdev.com.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrivingOperationTest {

    @Test
    void testLimit() {
        List.of("Hanif", "Adi", "Orkhan", "Hafizah", "Ani", "Adiba").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Hanif", "Adi", "Orkhan", "Hafizah", "Ani", "Adiba").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        // mengambil hanya selama true,, ketika sudah ketemu false maka selssai prosesnya
        List.of( "Ani", "Adi", "Orkhan", "Hafizah", "Hanif" , "Adiba").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        // mengambil hanya selama false,, ketika sudah ketemu true maka selssai prosesnya
        List.of( "Ani", "Adi", "Orkhan", "Hafizah", "Hanif" , "Adiba" , "Abi").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of( "Ani", "Adi", "Orkhan", "Hafizah", "Hanif" , "Adiba" , "Abi").stream()
                .findAny();
        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of( "Ani", "Adi", "Orkhan", "Hafizah", "Hanif" , "Adiba" , "Abi").stream()
                .findFirst();
        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}

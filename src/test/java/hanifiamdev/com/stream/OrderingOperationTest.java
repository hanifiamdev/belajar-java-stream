package hanifiamdev.com.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        List.of("Ani", "Adi", "Orkhan", "Hafizah", "Hanif" , "Adiba" , "Abi").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Ani", "Adi", "Orkhan", "Hafizah", "Hanif" , "Adiba" , "Abi").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}

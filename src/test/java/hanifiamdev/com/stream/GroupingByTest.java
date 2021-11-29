package hanifiamdev.com.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByTest {

    @Test
    void testCollectorsGroupingBy() {
        // Kode : Grouping By
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<String, List<Integer>> map1 = numbers.stream()
                .collect(Collectors.groupingBy(integer -> integer > 5 ? "Besar" : "Kecil"));
        System.out.println(map1);


        List<String> names = List.of( "Ani", "Adi", "Orkhan", "Hafizah", "Hanif" , "Adiba" , "Abi");

        Map<String, List<String>> map2 = names.stream()
                .collect(Collectors.groupingBy(name -> name.length() > 4 ? "Besar" : "Kecil"));
        System.out.println(map2);
    }

    @Test
    void testCollectorsPartition() {
        // Kode : Partitioning By
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> map1 = numbers.stream()
                .collect(Collectors.partitioningBy(integer -> integer > 5));
        System.out.println(map1);


        List<String> names = List.of( "Ani", "Adi", "Orkhan", "Hafizah", "Hanif" , "Adiba" , "Abi");

        Map<Boolean, List<String>> map2 = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println(map2);
    }
}

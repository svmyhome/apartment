package black;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CollectionsTest {

    @Test
    void CollectionTest() {
        List<String> list = new ArrayList<>(Arrays.asList("Zaur", "Ivan", "Mariya"));
        list.add("Petr");
        System.out.println("Before sorting");
        System.out.println(list);
        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list);

    }
}

package Lab2.Strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCollectionsTest {
    String[] withComparable;
    IntegerAscendingComparator integerAscendingComparator = new IntegerAscendingComparator();
    Integer[] withCustomComparable;
    @BeforeEach
    void setUp() {
        withComparable = new String[]{"mcnasd", "asdlkjad", "xzczxc"};
        withCustomComparable = new Integer[]{5, 3, 2, 12, 21, 31, 12};
    }

    @Test
    void sort() {
        MyCollections.sort(withComparable);
        assertEquals(new String[]{"asdlkjad", "mcnasd", "xzczxc"}, withComparable);
    }

    @Test
    void testSort() {
        MyCollections.sort(withCustomComparable, integerAscendingComparator);
        assertEquals(new Integer[]{2, 3, 5, 12, 12, 21, 31}, withComparable);
    }
}
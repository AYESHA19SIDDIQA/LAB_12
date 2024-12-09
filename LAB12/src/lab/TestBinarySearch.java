package lab;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class TestBinarySearch  {

    @Test
    public void testBinarySearchRecursiveFound() {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        int result = BinarySearch.binarySearchRecursive(array, "cherry", 0, array.length - 1);
        assertEquals("Target 'cherry' should be found at index 2", 2, result);
    }

    @Test
    public void testBinarySearchRecursiveNotFound() {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        int result = BinarySearch.binarySearchRecursive(array, "fig", 0, array.length - 1);
        assertEquals("Target 'fig' should not be found", -1, result);
    }
    

    @Test
    public void testBinarySearchAllIndicesFound() {
        String[] array = {"apple", "banana", "cherry", "cherry", "elderberry"};
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);

        List<Integer> result = BinarySearch.binarySearchAllIndices(array, "cherry", 0, array.length - 1, new ArrayList<>());
        assertEquals("All indices of 'cherry' should be found", expected, result);
    }

    @Test
    public void testBinarySearchAllIndicesNotFound() {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        List<Integer> result = BinarySearch.binarySearchAllIndices(array, "fig", 0, array.length - 1, new ArrayList<>());
        assertTrue("Target 'fig' should not be found in the array", result.isEmpty());
    }
}

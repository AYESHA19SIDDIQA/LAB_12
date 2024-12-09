package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

    // Recursive Binary Search for strings
    public static int binarySearchRecursive(String[] array, String target, int left, int right) {
        if (left > right) {
            return -1; // Target not found
        }

        int mid = left + (right - left) / 2;

        if (array[mid].equals(target)) {
            return mid; // Target found
        } else if (array[mid].compareTo(target) > 0) {
            return binarySearchRecursive(array, target, left, mid - 1); // Search left
        } else {
            return binarySearchRecursive(array, target, mid + 1, right); // Search right
        }
    }

    // Variant: Find all indices of a target string
    public static List<Integer> binarySearchAllIndices(String[] array, String target, int left, int right, List<Integer> indices)
 {
        if (left > right) {
            return indices;
        }

        int mid = left + (right - left) / 2;

        if (array[mid].equals(target)) {
            if (!indices.contains(mid)) { // Avoid duplicate indices
                indices.add(mid);
            }
        }

        // Search both halves to find duplicates
        binarySearchAllIndices(array, target, left, mid - 1, indices);
        binarySearchAllIndices(array, target, mid + 1, right, indices);


        return indices;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sorted array
        System.out.print("Enter a sorted array input (comma-separated): ");
        String input = scanner.nextLine();
        String[] array = input.split(",\\s*"); // Split by commas with optional spaces

        // Trim all elements
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }

        // Prompt for target word
        System.out.print("Enter the target word to search for: ");
        String target = scanner.nextLine().trim();

        // Perform single occurrence binary search
        int index = binarySearchRecursive(array, target, 0, array.length - 1);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } 

        // Perform search for all occurrences
        List<Integer> indices = binarySearchAllIndices(array, target, 0, array.length - 1, new ArrayList<>());
        if (indices.isEmpty()) {
        	System.out.println("Target not found in the array.");
        } 

        scanner.close(); }
}

package map;

import java.util.*;

class GFG {
    // Compare method to arrange the priority_queue
    // according to the frequency or lesser value
    // in case the frequency of two pairs matches.
    static class Compare implements Comparator<Map.Entry<Integer, Integer>> {
        public int compare(Map.Entry<Integer, Integer> p1, Map.Entry<Integer, Integer> p2) {
            // if the frequency matches, return the lesser value
            if (p1.getValue().equals(p2.getValue())) {
                return p1.getKey() - p2.getKey();
            } else {
                return p2.getValue() - p1.getValue();
            }
        }
    }

    // Method to find the k-most frequent number
    static void kMostFrequent(int[] arr, int n, int k) {
        // Create a HashMap to store the numbers and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store the numbers and frequency of occurrence
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Creating a priority queue (max heap) to store the map entries
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>(new Compare());

        // Add all entries from the map to the priority queue
        pq.addAll(map.entrySet());

        // Polling k-times to get the k-most frequent numbers
        for (int i = 0; i < k; i++) {
            // Display the key corresponding to the most frequently appeared element
            System.out.print(pq.poll().getKey() + " ");
        }
    }

    // Driver Method
    public static void main(String[] args) {
        // Base array
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1,2};

        // Value of k and n
        int k = 2, n = 9;

        // Calling the kMostFrequent method
        kMostFrequent(arr, n, k);
    }
}

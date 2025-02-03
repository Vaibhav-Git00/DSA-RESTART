package hashmapp;

import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Hashing (assuming values range from 0 to 12)
        int[] hashing = new int[13];

        // Query input count
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            
            // Validate index before accessing
            if (number >= 0 && number < n && arr[number] >= 0 && arr[number] < 13) {
                hashing[arr[number]]++;
            }
        }

        // Display the hash array
        for (int i = 0; i < hashing.length; i++) {
            System.out.print(hashing[i] + " ");
        }

        sc.close(); // Close scanner
    }
}

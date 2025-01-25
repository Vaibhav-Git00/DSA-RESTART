public class firstoccurance {
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1; // To store the index of the first occurrence

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;   // Update result
                high = mid - 1; // Search in the left half
            } else if (arr[mid] < target) {
                low = mid + 1;  // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return result; // Return the index or -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5}; // Sorted array
        int target = 2;

        int index = firstOccurrence(arr, target);
        System.out.println(index);
    }
}

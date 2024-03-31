public class BinarySearch {
    

    public static int binarySearch(int[] input, int elem){
        int start = 0;                          // Initialize start index of the array.
        int end = input.length - 1;             // Initialize end index of the array.
        
        while (start <= end) {                  // Continue searching until start index is less than or equal to end index.
            int mid = (start + end) / 2;        // Calculate the middle index of the array.
            
            if (elem == input[mid]) {           // If the element is found at the middle index.
                return mid;                     // Return the index of the element.
            } else if (elem > input[mid]) {     // If the element is greater than the middle element.
                start = mid + 1;                // Update the start index to search in the right half of the array.
            } else {                            // If the element is smaller than the middle element.
                end = mid - 1;                  // Update the end index to search in the left half of the array.
            }
        }
        
        return -1;                              // If the element is not found, return -1.
    }

    public static void main(String[] args){
        int[] input = {2,4,5,8,9,15,21,28};
        int index = binarySearch(input, 15);
        System.out.println(index);
    }

}

// Begin with the entire sorted array.
// Calculate the midpoint of the array.
// Compare the target value with the value at the midpoint.
// If the target value matches the value at the midpoint, the search is successful; return the index of the midpoint.
// If the target value is less than the value at the midpoint, continue the search on the left half of the array.
// If the target value is greater than the value at the midpoint, continue the search on the right half of the array.
// Repeat steps 2-6 until the target value is found or the search interval is empty.
/*Binary search is a highly efficient algorithm with a time complexity of O(log n), where n is the number of elements in the array. This makes it much faster than linear search for large arrays. However, binary search requires the array to be sorted beforehand, which can add additional overhead if the array is frequently updated. */
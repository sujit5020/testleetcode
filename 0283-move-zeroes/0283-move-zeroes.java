class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int j = 0; // Pointer for the next non-zero position
        
        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}

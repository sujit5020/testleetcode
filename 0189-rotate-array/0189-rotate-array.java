class Solution {
    public void rotate(int[] arr, int d) {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
    }
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
        //    
        
        // ArrayList<Integer> temp = new ArrayList<>();

        // for (int i = n - k; i < n; i++){
        //     temp.add(arr[i]);
        // }
        // // shifting 
        // for (int i = n - k - 1; i >= 0; i--){
        //     arr[i-k]=arr[i];
        // }
        // // push bakc temp in to last 
        // for (int i = 0; i < k; i++){
        //     arr[i] = temp.get(i - (n - k));
        // }

        
        
    
}
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peek = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[peek]){
                peek = i;
            }
        }
        return peek;
    }
}
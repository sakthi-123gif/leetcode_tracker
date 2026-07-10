// Last updated: 7/10/2026, 9:33:31 AM
class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
        int n = arr.length;
        int end = n-1;
        int mid = start+(end-start)/2;

        while(start <= end){
            //check target with mid
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
            mid = start+(end-start)/2;
        }

        return -1;

    }
}
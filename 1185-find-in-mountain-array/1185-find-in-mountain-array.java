/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);

        int result = binarysearch(mountainArr, target, peak);
        return result;

    }

    private int findPeak(MountainArray mountainArr){
        int left=0;
        int right=mountainArr.length() -1;

        while(left<right){
            int mid = (left+right)/2;
            int midVal = mountainArr.get(mid);
            int midNextVal = mountainArr.get(mid+1);

            if(midVal < midNextVal){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }

    private int binarysearch(MountainArray mountainArr, int target, int peak){
        int left = 0;
        int right = peak;

        while(left<=right){
            int mid = (left+right)/2;
            int midVal = mountainArr.get(mid);

            if(midVal==target){
                return mid;
            }else if(midVal<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        left = peak+1;
        right = mountainArr.length() -1;
        while(left<=right){
            int mid = (left+right)/2;
            int midVal = mountainArr.get(mid);

            if(midVal==target){
                return mid;
            }else if(midVal<target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return -1;
    }
    
}

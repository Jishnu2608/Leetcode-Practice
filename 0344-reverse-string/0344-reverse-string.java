class Solution {
    public void reverseString(char[] a) {
        int left = 0;
        int right = a.length-1;

        while(left<right){
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }
}
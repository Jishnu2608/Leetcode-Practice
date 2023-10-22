class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0; i<m;i++){
            list1.add(nums1[i]);
        }
        for(int i=0; i<n; i++){
            list2.add(nums2[i]);
        }

        list1.addAll(list2);
        Collections.sort(list1);
        for(int i = 0; i < m + n; i++) {
            nums1[i] = list1.get(i);
        }
    }   
}
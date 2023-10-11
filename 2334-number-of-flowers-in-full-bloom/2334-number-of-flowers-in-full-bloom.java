class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i=0;i<n;i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int m = people.length;
        int[] ans = new int[m];

        for(int i=0;i<m;i++){
            int x=binarySearch(start, people[i]+1);
            int y=binarySearch(end, people[i]);

            ans[i] = x-y;
        }
        return ans;
    }

    int binarySearch(int[] arr, int target){
        int res=arr.length;
        int left=0,right=arr.length-1;

        while(left<=right){
            int mid = (left+right) >> 1;
            if(arr[mid] >= target){
                res=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return res;
    }
}
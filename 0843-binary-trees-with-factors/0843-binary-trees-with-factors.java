class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        final int mod = 1000000007;

        Arrays.sort(arr);
        Set<Integer> unique = new HashSet<>();
        for(int num : arr){
            unique.add(num);
        }

        Map<Integer, Integer> dp = new HashMap<>();
        for(int num : arr){
            dp.put(num,1);
        }

        for(int i : arr){
            for(int j : arr){
                if(j > Math.sqrt(i)){
                    break;
                }

                if(i%j==0 && unique.contains(i/j)){
                    long product = (long) dp.get(j) * dp.get(i/j);
                    dp.put(i, (int) ((dp.get(i) + (i/j == j ? product : product*2)) % mod));
                }
            }
        }
        int result = 0;
        for(int i : dp.values()){
            result = (result + i) % mod;
        }

        return result;
    }
}
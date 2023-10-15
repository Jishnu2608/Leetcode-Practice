class Solution {
    public int numWays(int steps, int len) {
        int max = Math.min(steps/2 + 1, len);
        int[] currWays = new int[max + 2];
        int[] nextWays = new int[max +2];

        currWays[1] = 1;
        int mod = (int)1e9 +7;
        while(steps > 0){
            for(int pos=1;pos<=max;pos++){
                nextWays[pos] = (int)(((long) currWays[pos] + currWays[pos-1] + currWays[pos+1]) % mod);
            }

            int temp[] = currWays;
            currWays = nextWays;
            nextWays = temp;
            steps--;
        }

    return currWays[1];      
    }
}
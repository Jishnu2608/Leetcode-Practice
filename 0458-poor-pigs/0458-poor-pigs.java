class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int testsPerPig = minutesToTest / minutesToDie;
        int numPigs = 0;
        int states = 1;
        while(states < buckets){
            states *= (testsPerPig + 1);
            numPigs++;
        }

        return numPigs;
    }
}
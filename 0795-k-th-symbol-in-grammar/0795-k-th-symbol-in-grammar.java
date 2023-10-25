class Solution {
    public int kthGrammar(int n, int k) {
        boolean valuesSame = true;

        n = (int)Math.pow(2,n);

        while(n!=1){
            n/=2;

            if(k>n){
                k -= n;
                valuesSame = !valuesSame;
            }
        }

        if(valuesSame){
            return 0;
        }
        else {
            return 1;
        }
    }
}
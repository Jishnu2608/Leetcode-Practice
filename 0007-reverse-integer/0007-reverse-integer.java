class Solution {
    public int reverse(int x) {
        boolean isNegative = false;

        if(x<0){
            isNegative = true;
            x = Math.abs(x);
        }

        long reversed = 0;

        while(x != 0){
            int digit = x%10;
            reversed = reversed*10 + digit;
            x/=10;
        }

        if(isNegative){
            reversed = -reversed;
        }

        if(reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE){
            return 0;
        }

        return (int) reversed;
    }
}
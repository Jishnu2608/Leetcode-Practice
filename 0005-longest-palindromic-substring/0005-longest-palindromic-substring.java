class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length() < 2)   return s;

        String longest = "";
        for(int i=0;i<s.length();i++){
            String palindrome1 = expandAroundCenter(s,i,i);
            if(palindrome1.length() > longest.length()) longest = palindrome1;
            
            String palindrome2 = expandAroundCenter(s,i,i+1);
            if(palindrome2.length() > longest.length()) longest = palindrome2;
        }

        return longest;
    }

    private String expandAroundCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }
}
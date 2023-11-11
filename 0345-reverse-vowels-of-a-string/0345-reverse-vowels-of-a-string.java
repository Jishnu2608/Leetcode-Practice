class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            while(start<end && !isVowel(ch[start])) 
                start++;
            while (start<end && !isVowel(ch[end]))
                end--;

            if(start<end){
                swap(ch,start,end);
                start++;
                end--;
            }
        }
        return new String(ch);
    }

    private void swap(char[] word, int start, int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    private boolean isVowel(char c){
        return c== 'a' || c== 'A' || c== 'e' || c== 'E' || c== 'i' || c== 'I' || c== 'o' || c== 'O' || c== 'u' || c== 'U';
    }
}
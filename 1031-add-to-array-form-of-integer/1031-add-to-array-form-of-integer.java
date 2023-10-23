class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        int n = num.length;
        
        List<Integer> list=  new ArrayList<>();

        for (int i = n - 1; i >= 0 || k > 0 || carry > 0; i--) {
            int x = (i >= 0) ? num[i] : 0;
            int sum = x + k % 10 + carry;
            list.add(sum % 10);
            carry = sum / 10;
            k /= 10;
        }

        Collections.reverse(list);

        return list;
    }
}
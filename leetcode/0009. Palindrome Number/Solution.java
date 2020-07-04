class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        List<Integer> list = new ArrayList<Integer>();
        while(x > 0) {
            list.add(x % 10);
            x /= 10;
        }
        int digits = list.size();
        for (int i = 0; i < digits / 2; i++) {
            if (!list.get(i).equals(list.get(digits - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}

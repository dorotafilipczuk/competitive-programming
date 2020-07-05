class Solution {
    public int romanToInt(String s) {
        // Populate the lookup table.
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int length = s.length();
        int result = 0;
        int first = 0;
        int second = map.get(s.charAt(0));
        for(int i = 0; i < length - 1; i++) {
            first = map.get(s.charAt(i));
            second = map.get(s.charAt(i + 1));
            if(first < second) {
                result += second - first;
                i++;
                second = 0;
                if (i + 2 == length) {
                    second = map.get(s.charAt(i + 1));
                }
            }
            else {
                result += first;
            }
        }
        result += second;
        return result;
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int currentIndex = 0;
        while(true) {
            if (strs.length == 0 || strs[0].length() == currentIndex) {
                return result.toString();
            }
            char currentChar = strs[0].charAt(currentIndex);
            for(int i = 1; i < strs.length; i++) {
                if (strs[i].length() == currentIndex ||
                      strs[i].charAt(currentIndex) != currentChar) {
                    return result.toString();
                }
            }
            result.append(currentChar);
            currentIndex++;
        }
    }
}

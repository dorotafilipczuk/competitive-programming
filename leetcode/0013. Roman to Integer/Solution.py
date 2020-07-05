class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        mappings = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        result = 0

        i = len(s) - 1
        while i >= 0:
            value = mappings[s[i]]
            if i != 0 and mappings[s[i - 1]] < value:
                value -= mappings[s[i - 1]]
                i -= 1
            result += value
            i -= 1
        return result
        

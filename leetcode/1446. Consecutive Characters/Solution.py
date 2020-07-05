class Solution(object):
    def maxPower(self, s):
        """
        :type s: str
        :rtype: int
        """
        length = 1
        result = 1
        previous = s[0]

        for i in range(1, len(s)):
            if s[i] == previous:
                length += 1
            else:
                if length > result:
                    result = length
                length = 1
            previous = s[i]

        return max(length, result)        

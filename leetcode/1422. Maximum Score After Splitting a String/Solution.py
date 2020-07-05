class Solution(object):
    def maxScore(self, s):
        """
        :type s: str
        :rtype: int
        """
        zeros = 0
        ones = 0
        if s[0] == "0":
            zeros += 1
        for i in range(1, len(s)):
            if s[i] == "1":
                ones += 1

        maxscore = zeros + ones

        for i in range(1, len(s) - 1):
            if s[i] == "0":
                zeros += 1
            else:
                ones -= 1
            score = zeros + ones
            maxscore = max(maxscore, score)

        return maxscore

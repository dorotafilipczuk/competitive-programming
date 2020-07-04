class Solution(object):
    def xorOperation(self, n, start):
        """
        :type n: int
        :type start: int
        :rtype: int
        """
        xored = start
        for i in range(1, n):
            xored ^= 2 * i + start
        return xored

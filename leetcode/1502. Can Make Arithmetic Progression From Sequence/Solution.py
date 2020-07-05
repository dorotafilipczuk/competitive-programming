class Solution(object):
    def canMakeArithmeticProgression(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        if len(arr) == 2:
            return True

        ordered = sorted(arr)
        difference = ordered[1] - ordered[0]
        previous = ordered[1]

        for i in range(2, len(ordered)):
            if ordered[i] - previous != difference:
                return False
            previous = ordered[i]

        return True

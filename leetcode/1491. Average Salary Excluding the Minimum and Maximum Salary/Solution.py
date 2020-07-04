class Solution(object):
    def average(self, salary):
        """
        :type salary: List[int]
        :rtype: float
        """
        ordered = sorted(salary)
        summed = 0.0
        for i in range(1, len(ordered) - 1):
            summed += ordered[i]
        return summed / (len(ordered) - 2)

class Solution(object):
    def buildArray(self, target, n):
        """
        :type target: List[int]
        :type n: int
        :rtype: List[str]
        """
        t = 0
        result = []
        for i in range(1, n + 1):
            result.append("Push")
            if i != target[t]:
                result.append("Pop")
            else:
                if t + 1 < len(target):
                    t += 1
                else:
                    return result
        return result
        

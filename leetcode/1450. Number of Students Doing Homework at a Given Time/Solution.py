class Solution(object):
    def busyStudent(self, startTime, endTime, queryTime):
        """
        :type startTime: List[int]
        :type endTime: List[int]
        :type queryTime: int
        :rtype: int
        """
        result = 0

        if len(startTime) == 0 or len(endTime) == 0:
            return result

        for i in range(0, len(startTime)):
            if startTime[i] <= queryTime and endTime[i] >= queryTime:
                result += 1
        return result
        

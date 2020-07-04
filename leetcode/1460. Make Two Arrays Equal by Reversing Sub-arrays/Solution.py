class Solution(object):
    def canBeEqual(self, target, arr):
        """
        :type target: List[int]
        :type arr: List[int]
        :rtype: bool
        """
        mapTarget = {}
        mapArr = {}

        for i in target:
            occurences = 1
            if i in mapTarget.keys():
                occurences = mapTarget[i] + 1
            mapTarget[i] = occurences

        for i in arr:
            occurences = 1
            if i in mapArr.keys():
                occurences = mapArr[i] + 1
            mapArr[i] = occurences

        for i in mapTarget.keys():
            if i not in mapArr.keys() or mapTarget[i] != mapArr[i]:
                return False

        for i in mapArr.keys():
            if i not in mapTarget.keys():
                return False

        return True
        

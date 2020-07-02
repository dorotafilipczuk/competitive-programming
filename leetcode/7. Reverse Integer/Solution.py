class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        isNegative = False
        absoluteVal = x
        if x < 0:
            absoluteVal = abs(x)
            isNegative = True
        
        reversedStr = "".join(reversed(str(absoluteVal)))
        
        # If the reversed integer overflows, return 0.
        maxIntStr = "2147483647"
        minIntStr = "2147483648"
        if len(reversedStr) >= 10:
            i = 0
            if isNegative:
                while reversedStr[i] == minIntStr[i]:
                    i += 1
                if reversedStr[i] > minIntStr[i]:
                    return 0
            else:
                while reversedStr[i] == maxIntStr[i]:
                    i += 1
                if reversedStr[i] > maxIntStr[i]:
                    return 0
        
        if isNegative:
            reversedStr = "-" + reversedStr
        
        return int(reversedStr)

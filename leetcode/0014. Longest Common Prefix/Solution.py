class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 0 or len(strs[0]) == 0:
            return ""

        result = ""
        for i in range(len(strs[0])):
            current_char = strs[0][i]
            for word in strs:
                if i == len(word) or word[i] != current_char:
                    return result
            result += current_char
        return result

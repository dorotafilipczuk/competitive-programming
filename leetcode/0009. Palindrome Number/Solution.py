class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x == 0:
            return True
        if x < 0 or x % 10 == 0:
            return False

        # Reverse x.
        copy = x
        reverse = 0

        while copy != 0:
            last_digit = copy % 10
            copy /= 10
            reverse =  reverse * 10 + last_digit

        # Check if the reversed x and x are the same.
        if reverse == x:
            return True
        else:
            return False
        

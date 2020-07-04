class Solution(object):
    def finalPrices(self, prices):
        """
        :type prices: List[int]
        :rtype: List[int]
        """
        result = []
        for i in range(0, len(prices)):
            discount_found = False
            for j in range(i + 1, len(prices)):
                if prices[j] <= prices[i]:
                    discount_found = True
                    result.append(prices[i] - prices[j])
                    break
            if not discount_found:
                result.append(prices[i])
        return result

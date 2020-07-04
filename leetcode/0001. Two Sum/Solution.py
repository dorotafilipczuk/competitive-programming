class Solution(object):
    def twoSum(self, nums, target):
        hash_table = {}
        for i in range(0, len(nums)):
            complement = target - nums[i]
            if complement in hash_table:
                return [i, hash_table[complement]]
            hash_table[nums[i]] = i

        raise ValueError("No two sum solution")

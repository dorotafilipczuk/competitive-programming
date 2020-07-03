class Solution(object):
    def isPathCrossing(self, path):
        """
        :type path: str
        :rtype: bool
        """
        x = 0
        y = 0
        visited = set()

        for i in path:
            visited.add((x, y))
            if i == 'N':
                y += 1
            elif i == 'S':
                y -= 1
            elif i == 'E':
                x += 1
            elif i == 'W':
                x -= 1
            if (x, y) in visited:
                return True

        return False

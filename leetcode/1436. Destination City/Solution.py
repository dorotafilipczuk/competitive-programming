class Solution(object):
    def destCity(self, paths):
        """
        :type paths: List[List[str]]
        :rtype: str
        """
        cities = set()
        connections = {}

        for i in paths:
            source = i[0]
            destination = i[1]
            connections[source] = destination
            cities.add(source)
            cities.add(destination)

        for i in cities:
            if i not in connections.keys():
                return i

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        countDict = {}
        freqList = [[] for i in range(len(nums) + 1)]

        for num in nums:
            countDict[num] = 1 + countDict.get(num, 0)

        for num, count in countDict.items():
            freqList[count].append(num)

        result = []

        for i in range(len(freqList) - 1, 0, -1):
            for num in freqList[i]:
                result.append(num)
                
                if len(result) == k:
                    return result
class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        trackDict = {"}": "{", "]": "[", ")": "("}

        for c in s:
            if c in trackDict.values():
                stack.append(c)
            elif c in trackDict:
                if not stack or stack[-1] != trackDict[c]:
                    return False
                else:
                    stack.pop()

        return not stack
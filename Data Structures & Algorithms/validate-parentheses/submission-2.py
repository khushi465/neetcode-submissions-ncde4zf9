class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for c in s:
            if c=="{" or c=="(" or c=="[":
                stack.append(c)
            else:
                if not stack:
                    return False 
                peek=stack.pop()
                if (peek=="[" and c!="]") or peek=="{" and c!="}" or peek=="(" and c!=")":
                    return False
        return True if not stack else False
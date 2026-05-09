class Solution:

    def encode(self, strs: List[str]) -> str:
        # give a number of len and then the string after # and then 
        if len(strs)==0:
            return ""
        encoded=""
        for s in strs:
            encoded+=str(len(s))+"#"+s
        return encoded
        

    def decode(self, s: str) -> List[str]:
        if s=="":
            return []
        decoded=[]
        i=0
        while i<len(s):
            j=i
            while s[j]!="#" and j<len(s):
                j+=1
            length = int(s[i:j])
            i=j+1
            j=i+length
            decoded.append(s[i:j])
            i=j
        return decoded

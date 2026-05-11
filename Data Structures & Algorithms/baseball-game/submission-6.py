class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack=[]
        for op in operations:

            match op:
                case "+":
                    peek=stack.pop()
                    peek2=stack[-1]
                    stack.append(peek)
                    stack.append(peek+peek2)
                    print(str(peek)+" "+str(peek2)+" "+str(peek+peek2))
                case "C":
                    peek=stack.pop()
                    print(peek)
                case "D":
                    print(stack[-1]*2)
                    stack.append(stack[-1]*2)
                case _:
                    print(op)
                    stack.append(int(op))
                
        sum=0
        for s in stack:
            sum+=s
        return sum
# Sum of nnumbers till n
def Sum(n):
    if n == 0:
        return 0

    prevSum = Sum(n-1) 
    return n + prevSum
    
n = 10
print(Sum(n))

'''
#n raised to power p
def nRaisedtoP(n, p):
    if p == 0:
        return 1
    return n*nRaisedtoP(n, p-1)


n = 3
p = 5
print(nRaisedtoP(n, p))
'''

'''
#n factorial
def findFactorial(n):
    if n == 1:
        return 1
    return n*findFactorial(n-1)

n = 7
print(findFactorial(n))
'''
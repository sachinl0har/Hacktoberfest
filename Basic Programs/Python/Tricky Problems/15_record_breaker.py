# arr = [15,16,17,18,19,17,15,8,23,25,4]
arr = [1,2,0,7,2,0,2,2]
n = len(arr)
# print(n)

record = 0

for i in range(n):
    flag1 = True
    flag2 = True

    for j in range(0,i):
        if arr[i] < arr[j]:
            flag1 = False
        
    if flag1 == True:
        if i != n-1:
            if arr[i] < arr[i+1]:
                flag2 = False
    
    if flag1 == True and flag2 ==  True:
        record += 1

print("No. of record breaking days are: ", record)

        
    

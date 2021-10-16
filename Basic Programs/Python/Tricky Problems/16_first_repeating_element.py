arr = [1,2,3,4,13,9,2,3,4]
n = len(arr)
appeared = []

for i in range(n):
    if arr[i] in appeared:
        print("First repeating element is", arr[i], "and its index where it first appears is", arr.index(arr[i]))
        break
    else:
        appeared.append(arr[i]) 
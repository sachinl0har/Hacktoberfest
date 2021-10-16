import time

def firstOcc(arr, n, i, key):
    if i == n: 
        return -1
    if arr[i] == key:
        return i
    return firstOcc(arr, n, i+1, key)

def lastOcc(arr, n, i, key):
    if i < 0:
        return -1
    if arr[i] == key:
        return i
    return lastOcc(arr, n, i-1, key)
arr = [2,12,6,4,8,9,1,5,3, 3]
n = len(arr)

start_time = time.time()
print(firstOcc(arr, n, 0, 3))
print(lastOcc(arr, n, n-1, 3))
print("--- %s seconds ---" % (time.time() - start_time))
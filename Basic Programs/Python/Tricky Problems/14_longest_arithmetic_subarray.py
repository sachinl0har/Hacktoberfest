# arr = [0, 1, 1, 2, 5, 7, 9, 11, 5, 13]
arr = [10, 7, 4, 6, 8, 10, 11]
# arr = [1,1,2,3,4,7,8, 5, 13]
lenn = len(arr)

# prev_cmn_diff = arr[1] - arr[0]

diff = []
for i in range(lenn-1):
    pd = arr[i+1] - arr[i]
    diff.append(pd)

# print(diff)
# print(len(diff))

diff_len = len(diff)
prev_diff = diff[0]
ans = 2

for i in range(1, diff_len):
    if diff[i] == prev_diff:
        ans += 1
    else:
        prev_diff = diff[i]
        # ans = 2

print("Answer is: ", ans)

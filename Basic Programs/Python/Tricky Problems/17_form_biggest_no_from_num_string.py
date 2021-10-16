s = "816571"
l = []
for i in s:
    l.append(int(i))

# s = sorted(s)
# print(str(s))
l.sort()
l.reverse()

ans = ""
for i in l:
    ans += str(i)

ans = int(ans)
print(ans)


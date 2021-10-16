s = "aaabbbcccdddeeffgggkkkkkkkkkkkkkkkk"

dictt = {}
for i in s:
    if i in dictt.keys():
        dictt[i] += 1
    else:
        dictt[i] = 1

val_list = []
for key, value in dictt.items():
    val_list.append(value)

for key, value in dictt.items():
    if value == max(val_list):
        print(key, "appears most times which is", value)

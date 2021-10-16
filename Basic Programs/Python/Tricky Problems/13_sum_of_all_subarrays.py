n = int(input("Enter size: "))
arr = []

for i in range(n):
    element = int(input("Enter the {}th element: ".format(i)))
    arr.append(element)
    
print("\nArray: ", arr)

sum = 0
for i in range(n):
    sum = 0
    for j in range(i, n):
        sum += arr[j]
        print("Sum is: ", sum)
    print("\n")
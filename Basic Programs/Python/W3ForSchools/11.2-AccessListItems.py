#You can access a specific variable of a list

myList = ["1", "2", "3", "4", "5", "6"]
#Counting starts with 0
print(myList[1]) #This is called indexing

#Negative indexing is the same as the normal one but with negative numbers
#Thay start on the end of the list
print(myList[-1])

#Range of indexes
print(myList[2:5])

#This example returns the items from the beginning to, but NOT included, "kiwi":

thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thislist[:4])

#This example returns the items from "cherry" and to the end:
print(thislist[2:])

#This example returns the items from "orange" (-4) to, but NOT included. "mango" (-1):
print(thislist[-4:-1])

if "applee" in thislist:
    print("Yes there i found it!")
else:
    print("I havent found your search")


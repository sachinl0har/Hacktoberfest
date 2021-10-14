# important:this syntax is create the empty dictionary not an empty set 
b={} 
print(type(b))


# the empty set is created using the below syntax:
c=set()
print(type(c))
c.add(4) 
c.add(5)
c.add(4) #adding a value repeatedly does not ch  1ange a set
c.add((4, 5, 6)) #add touples into the sets
# c.add({4:5})  # cannot add list or dictionary to sets
print(c)    
print(len(c))  # prints the lengths of this set
c.remove(5)  #remove 5 from the set b
c.remove(15) #throws an error while trying to remove 15 (which is not present in the set)
print(c)
print(c.pop())
print(c)
print(c.clear())
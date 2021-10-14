"""
Text Type:	str
Numeric Types:	int, float, complex
Sequence Types:	list, tuple, range
Mapping Type:	dict
Set Types:	set, frozenset
Boolean Type:	bool
Binary Types:	bytes, bytearray, memoryview
"""

#Getting data types
intv = 5
print (type(intv))

strv = "This is a string"
print (type(strv))

floatv = 20.5
print (type(floatv))

complexv = 1j
print (type(complexv))

listv = ["hello", "iahooo", "ame ame ame"]
print (type(listv))
print(listv)

tuplev = ["hello", "iahooo", "ame ame ame"]
print (type(tuplev))
print(tuplev)

rangev = range(6)
print (type(rangev))
print(rangev)

dictv = {"name" : "Yuuki", "age" : 57}
print (type(dictv))
print(dictv)

setv = {"apple", "banana", "cherry"}
print (type(setv))

frozensetv = frozenset({"apple", "banana", "cherry"})
print (type(frozensetv))

boolv = True
print (type(boolv))

boolv = False
print (type(boolv))

bytesv = b"Hello"
print (type(bytesv))

bytearrayv = bytearray(5)
print (type(bytearrayv))

memoryviewv = memoryview(bytes(5))
print (type(memoryviewv))

#Setting a specific data type

x = str("Hello World") #here i say that "Hello World is a sting"
x = int(20) #here i say that 20 it is a integer